package pl.iogreen.euler

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

@RunWith(classOf[JUnitRunner])
class Problem010Test extends FunSuite {

  val resolver = new Problem010()

  test("resolver") {
    assert(resolver.resolve(10) === 17)
    assert(resolver.resolve(100) === 1060)
    assert(resolver.resolve(1000) === 76127)
    assert(resolver.resolve(10000) === 5736396)
    assert(resolver.resolve(100000) === 454396537)
    assert(resolver.resolve(1000000) === 37550402023L)
    assert(resolver.resolve(2000000) === 142913828922L)
  }

}
