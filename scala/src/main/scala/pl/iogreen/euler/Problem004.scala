package pl.iogreen.euler

class Problem004 {


  def isPalindrom(s: String): Boolean = {
    s.equals(s.reverse)
  }

  def resolve(min: Int, max: Int): Int = {
    var maxValue = 0
    for (i <- min to max) {
      for (j <- min to max) {
        val result = i * j
        if (isPalindrom(result.toString) && result > maxValue) {
          println(s"$i :: $j")
          maxValue = result
        }
      }
    }
    maxValue
  }

}
