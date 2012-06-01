package pl.iogreen.algo.sort

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

@RunWith(classOf[JUnitRunner])
class SortTest extends FunSuite {


  test("insert test") {
    val sorter = new InsertSort();

    assert(sorter.sort(1 :: 2 :: 3 :: Nil) === 1 :: 2 :: 3 :: Nil)
    assert(sorter.sort(4 :: 2 :: 1 :: 3 :: Nil) === 1 :: 2 :: 3 :: 4 :: Nil)
  }
}
