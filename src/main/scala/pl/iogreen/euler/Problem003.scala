package pl.iogreen.euler

import collection.mutable.ListBuffer
import collection.immutable.Range.Inclusive
import collection.immutable.Range

class Problem003 {


  def primesSieve(n: Long): List[Int] = {
    if (n == 1) return 1 :: Nil
    println("Looking for primes less then: " + n)
    val maxPrime: Int = n.toInt
    val sieve: ListBuffer[Boolean] = ListBuffer.fill(maxPrime + 1)(true)
    val iRange: Range = 2.until(maxPrime / 2)
    for (i <- iRange) {
      if (sieve(i)) {
        val jRange: Inclusive = (2 * i).to(maxPrime, i)
        for (j <- jRange) {
          sieve.update(j, false)
        }
      }
    }

    var primes: List[Int] = Nil
    sieve.zipWithIndex foreach {
      case (value, index) => if (value && index > 1) primes = index :: primes
    }

    primes.reverse
  }

  def primeFactors(i: Long): List[Int] = {
    val primes = primesSieve((scala.math.sqrt(i)).toInt)

    var foundPrimeFactors: List[Int] = Nil
    for (n <- primes) {
      if ((n * n) <= i) {
        if (i % n == 0)
          foundPrimeFactors = n :: foundPrimeFactors
      }
    }

    foundPrimeFactors.reverse
  }

  def resolve(max: Long): Long = {
    var factor = 2
    var lastFactor = 1
    var n = max
    while (n > 1) {
      if (n % factor == 0) {
        lastFactor = factor
        n /= factor
        while (n % factor == 0) {
          n /= factor
        }
      }
      factor += 1
    }
    lastFactor
  }
}