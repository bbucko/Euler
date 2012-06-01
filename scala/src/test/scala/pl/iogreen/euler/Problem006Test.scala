package pl.iogreen.euler

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Problem006Test extends FunSuite {

  val resolver = new Problem006()

  test("test sum of squares") {
    assert(resolver.sumOfSquares(10) === 385)
    assert(resolver.sumOfSquares(100) === 338350)
  }

  test("test square of sum") {
    assert(resolver.squareOfSum(10) === 3025)
    assert(resolver.squareOfSum(100) === 25502500)
  }
  
  test("resolve") {
    assert(resolver.resolve(10) === 2640)
    assert(resolver.resolve(100) === 25164150)
  }
}
