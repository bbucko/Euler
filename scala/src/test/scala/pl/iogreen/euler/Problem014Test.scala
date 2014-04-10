package pl.iogreen.euler

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

@RunWith(classOf[JUnitRunner])
class Problem014Test extends FunSuite {

  val resolver = new Problem014()

  test("resolver") {
    assert(resolver.resolve(13) === 20)
    assert(resolver.resolve(100) === 119)
    assert(resolver.resolve(100000) === 351)
    assert(resolver.resolve(1000000) === 525)
  }

  test("test Collatz") {
    assert(resolver.generateCollatz(List(13)) === List(13, 40, 20, 10, 5, 16, 8, 4, 2, 1))
    assert(resolver.generateCollatz(List(100)) === List(100, 50, 25, 76, 38, 19, 58, 29, 88, 44, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1))
  }

}
