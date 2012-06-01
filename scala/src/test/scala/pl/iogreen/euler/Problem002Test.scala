package pl.iogreen.euler

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite


@RunWith(classOf[JUnitRunner])
class Problem002Test extends FunSuite {

  val resolver = new Problem002

  test("test simple fibonacci seq") {
    assert(resolver.fibonacci(5) === List(1, 2, 3))
    assert(resolver.fibonacci(100) === List(1, 2, 3, 5, 8, 13, 21, 34, 55, 89))
    assert(resolver.fibonacci(1000) === List(1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987))
    assert(resolver.fibonacci(10000) === List(1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765))
    assert(resolver.fibonacci(100000) === List(1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025))
    assert(resolver.fibonacci(1000000) === List(1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040))
    assert(resolver.fibonacci(4000000) === List(1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578))
  }

  test("test better fibonacci using streams") {
    assert(resolver.betterFibonacci(5) === List(1, 2, 3))
    assert(resolver.betterFibonacci(100) === List(1, 2, 3, 5, 8, 13, 21, 34, 55, 89))
    assert(resolver.betterFibonacci(1000) === List(1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987))
    assert(resolver.betterFibonacci(10000) === List(1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765))
    assert(resolver.betterFibonacci(100000) === List(1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025))
    assert(resolver.betterFibonacci(1000000) === List(1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040))
    assert(resolver.betterFibonacci(4000000) === List(1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578))
  }

  test("test resolution") {
    assert(resolver.resolve(5) === 2)
    assert(resolver.resolve(10) === 10)
    assert(resolver.resolve(100) === 44)
    assert(resolver.resolve(1000) === 798)
    assert(resolver.resolve(10000) === 3382)
    assert(resolver.resolve(100000) === 60696)
    assert(resolver.resolve(1000000) === 1089154)
    assert(resolver.resolve(4000000) === 4613732)
  }
}