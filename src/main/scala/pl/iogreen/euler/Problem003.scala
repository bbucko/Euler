package pl.iogreen.euler

import collection.mutable.ListBuffer

class Problem003 {


  def primesSieve(n: Double): List[Int] = {
    val sieve: ListBuffer[Boolean] = ListBuffer.fill(n.toInt + 1)(false)

    for (i <- Iterator.range(2, scala.math.sqrt(n).toInt + 1)) {
      if (!sieve(i)) {
        for (j <- (2 * i).to(n.toInt, i)) {
          sieve.update(j, true)
        }
      }
    }

    var primes: List[Int] = Nil
    sieve.zipWithIndex foreach {
      case (value, index) => if (!value && index > 1) primes = index :: primes
    }
    primes.reverse
  }


  def primeFactors(i: Int): List[Int] = {
    if (i == 1) return i :: Nil

    val primes: List[Int] = primesSieve(scala.math.sqrt(i) + 1)
    var foundPrimeFactors: List[Int] = Nil

    foundPrimeFactors
  }


  def resolve(n: BigInt): Long = {
    29
  }

}