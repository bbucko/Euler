package pl.iogreen.euler

import collection.mutable.ListBuffer


class Problem007 {

  def atkinSieve(limit: Int): List[Int] = {
    var result: List[Int] = Nil

    val sqareRoot: Int = scala.math.sqrt(limit).toInt
    val primes: ListBuffer[Boolean] = ListBuffer.fill(limit + 1)(false)

    for (x <- 1 until sqareRoot; y <- 1 until sqareRoot) {
      var n = 4 * x * x + y * y;
      if (n <= limit && (n % 12 == 1 || n % 12 == 5)) {
        primes(n) ^= true
      }

      n = 3 * x * x + y * y;
      if (n <= limit && n % 12 == 7) {
        primes(n) ^= true
      }

      n = 3 * x * x - y * y;
      if (x > y && n <= limit && n % 12 == 11) {
        primes(n) ^= true
      }
    }

    for (n <- 5 until sqareRoot) {
      if (primes(n)) {
        val s = n * n;
        for (k <- s to(limit, s)) {
          primes(k) = false
        }
      }
    }

    for (n <- 5 to(limit, 2)) {
      if (primes(n) && isPrime(n)) {
        result = n :: result
      }
    }

    2 :: 3 :: result.reverse
  }

  def isPrime(n: Long): Boolean = {
    val ceil = math.sqrt(n).longValue()
    var m = 2L
    while (m <= ceil) {
      if (n % m == 0) {
        return false
      }
      m += 1
    }
    true
  }

  def resolve(n: Int): Int = {
    var primeCount = 1
    var lastNumber = 2

    while (primeCount < n) {
      lastNumber += 1
      if (isPrime(lastNumber)) {
        primeCount += 1
      }
    }
    lastNumber
  }

}
