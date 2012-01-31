package pl.iogreen.euler

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

@RunWith(classOf[JUnitRunner])
class Problem009Test extends FunSuite {

  val resolver = new Problem009()

  test("resolve") {
    assert(resolver.resolve() === 31875000)
  }

}
