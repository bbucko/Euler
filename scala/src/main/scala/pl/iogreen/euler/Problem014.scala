package pl.iogreen.euler

import scala.annotation.tailrec
import scala.collection.concurrent.TrieMap


class Problem014 {

  val cache = TrieMap[BigInt, Int]()

  def resolve(n: Int): Int = {
    //    (1 until n).par.map(p => generateCollatz(List(p)).size).max
    //    (n until 1 by -1).par.map(p => generateCollatz2(p)).max

    val now = System.currentTimeMillis()
    val result = (1 until n).map(p => (generateCollatz2(p), p)).sortBy(_._1).last
    println(s"Result ${result._2} in ${System.currentTimeMillis() - now} ms")
    result._1
  }

  @tailrec final def generateCollatz(tail: List[Int]): List[Int] = {
    if (tail.head == 1) return tail
    if (tail.head % 2 == 0) generateCollatz(tail.head / 2 :: tail) else generateCollatz(tail.head * 3 + 1 :: tail)
  }

  def generateCollatz2(n: Int): Int = {
    var i: BigInt = n
    var count = 1
    while (i != BigInt(1)) {
      if (i % 2 == BigInt(0)) i = i / 2 else i = 3 * i + 1
      if (cache.contains(i)) {
        val cachedLength: Int = cache.get(i).get + count
        cache.put(n, cachedLength)
        return cachedLength
      }
      count = count + 1
    }
    cache.put(n, count)
    count
  }
}
