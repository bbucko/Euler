package pl.iogreen.euler

class Problem009 {


  def resolve(): Long = {

    for (a <- 1 until 1000; b <- 1 until 1000; c <- 1 until 1000) {
      if (a * a + b * b == c * c && a + b + c == 1000) {
        println("a: " + a + " b: " + b + " c: " + c)
        return a * b * c
      }
    }
    0L
  }
}
