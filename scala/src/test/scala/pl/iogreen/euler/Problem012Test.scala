package pl.iogreen.euler

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

@RunWith(classOf[JUnitRunner])
class Problem012Test extends FunSuite {

  val resolver = new Problem012()

  test("resolver") {
    assert(resolver.resolve(1) === 3)
    assert(resolver.resolve(2) === 6)
    assert(resolver.resolve(3) === 6)
    assert(resolver.resolve(4) === 28)
    assert(resolver.resolve(500) === 76576500)
  }

  test("findDivisors") {
    assert(resolver.findNumberOfDivisors(1) === List(1).size)
    assert(resolver.findNumberOfDivisors(3) === List(1, 3).size)
    assert(resolver.findNumberOfDivisors(6) === List(1, 2, 3, 6).size)
  }

  //  test("triangleNumbersSequenceAndSum") {
  //    assert(resolver.createSequence(1) === List(1))
  //    assert(resolver.createSequence(2) === List(1, 2))
  //    assert(resolver.createSequence(7) === List(1, 2, 3, 4, 5, 6, 7))
  //
  //    assert(resolver.createSequence(1).sum === 1)
  //    assert(resolver.createSequence(2).sum === 3)
  //    assert(resolver.createSequence(3).sum === 6)
  //    assert(resolver.createSequence(4).sum === 10)
  //    assert(resolver.createSequence(5).sum === 15)
  //    assert(resolver.createSequence(6).sum === 21)
  //    assert(resolver.createSequence(7).sum === 28)
  //    assert(resolver.createSequence(8).sum === 36)
  //    assert(resolver.createSequence(9).sum === 45)
  //    assert(resolver.createSequence(10).sum === 55)
  //  }
  //
  //  test("triangleNumbersDivisors") {
  //    assert(resolver.calculateTriangleNumberDivisors(1) === List(1))
  //    assert(resolver.calculateTriangleNumberDivisors(2) === List(1, 3))
  //    assert(resolver.calculateTriangleNumberDivisors(3) === List(1, 2, 3, 6))
  //    assert(resolver.calculateTriangleNumberDivisors(10) === List(1, 5, 11, 55))
  //    assert(resolver.calculateTriangleNumberDivisors(10000).size === 80)
  //    assert(resolver.calculateTriangleNumberDivisors(20000).size === 200)
  //  }
}
