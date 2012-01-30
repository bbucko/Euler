package pl.iogreen.euler


class Problem008 {

  def resolve(str: String, window: Int): Int = {
    var maxResult = 0

    for (i <- 0 to str.length() - window) {
      val numbers = str.substring(i, i + window)
      var result = 1

      for (x <- 0 to numbers.length() - 1) {
        result *= Integer.valueOf(numbers.charAt(x).toString)
      }

      if (result > maxResult) {
        maxResult = result
      }
    }

    maxResult
  }
}
