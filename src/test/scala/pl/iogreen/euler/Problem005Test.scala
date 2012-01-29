package pl.iogreen.euler

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Problem005Test extends FunSuite {

  val resolver = new Problem005()

  test("test resolver") {
    assert(resolver.resolve(10) === 2520)
    assert(resolver.resolve(20) === 232792560)
  }

}
