package pl.iogreen.algo.sort

import collection.mutable.ListBuffer


class InsertSort {

  def sort(list: List[Int]): List[Int] = {
    val A: ListBuffer[Int] = new ListBuffer[Int]()
    A.appendAll(list)
    for (j <- 1 until list.length) {
      val key = A(j)
      var i = j - 1
      while (i >= 0 && A(i) > key) {
        A.update(i + 1, A(i))
        i -= 1
      }
      A(i + 1) = key
    }

    A.toList
  }
}
