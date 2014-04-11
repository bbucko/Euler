package pl.iogreen.euler

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

@RunWith(classOf[JUnitRunner])
class Problem015Test extends FunSuite {

  val resolver = new Problem015()

  test("resolver") {
    assert(resolver.resolve(2) === 6)
    assert(resolver.resolve(5) === 252)
    assert(resolver.resolve(10) === 184756)
    assert(resolver.resolve(20) === BigInt("137846528820"))
    assert(BigInt(2).pow(1000).toString().map(Character.getNumericValue).par.sum === 1366)
  }

}
