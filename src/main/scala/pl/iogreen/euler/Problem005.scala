package pl.iogreen.euler

class Problem005 {

  def checkNumber(i: Int, dividers: Range): Boolean = {
    for (div <- dividers) {
      if (i % div != 0) {
        return false
      }
    }
    true
  }

  def resolve(n: Int): Int = {
    val dividers = 1 to n
    var i = n
    while (true) {
      i += n
      if (checkNumber(i, dividers)) {
        return i
      }
    }
    0
  }

}
