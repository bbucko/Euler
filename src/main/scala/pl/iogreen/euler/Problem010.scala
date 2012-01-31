package pl.iogreen.euler


class Problem010 {

  val primeHelper = new Problem007()

  def resolve(n: Long): Long = {
    primeHelper.nextPrime(2).takeWhile(_ < n).toList.sum
  }
}
