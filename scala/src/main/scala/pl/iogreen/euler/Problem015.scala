package pl.iogreen.euler


class Problem015 {

  val cache = collection.mutable.Map[(Int, Int), BigInt]()

  def resolve(n: Int): BigInt = {
    path(n, n)
  }

  def path(x: Int, y: Int): BigInt = {
    if (x == 0 || y == 0) return 1
    cache.getOrElseUpdate((x, y), path(x, y - 1) + path(x - 1, y))
  }
}
