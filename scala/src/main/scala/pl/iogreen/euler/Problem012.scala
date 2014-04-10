package pl.iogreen.euler

class Problem012 {
  val primeSieve = new Problem003()

  def resolve(n: Int): Int = {
    var i = 0
    var noOfDivisors = 0
    var triangleNumber = 0
    var maxNumberOfDivisors = 0
    while (noOfDivisors <= n) {
      triangleNumber = triangleNumber + i
      noOfDivisors = findNumberOfDivisors(triangleNumber)
      i = i + 1
      if (noOfDivisors > maxNumberOfDivisors) {
        maxNumberOfDivisors = noOfDivisors
        println(s"noOfDivisors: $noOfDivisors for triangleNumber: $triangleNumber")
      }
    }

    triangleNumber
  }

  def findNumberOfDivisors(n: Int): Int = {
    val sqrt = Math.sqrt(n).toInt
    val i: Int = (1 to sqrt).par.count {
      n % _ == 0
    }
    if (sqrt * sqrt == n) i * 2 - 1 else i * 2
  }
}
