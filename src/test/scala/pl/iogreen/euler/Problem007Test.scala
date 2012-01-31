package pl.iogreen.euler

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Problem007Test extends FunSuite {

  val resolver = new Problem007()

  test("generating primes") {
    assert(resolver.atkinSieve(5) === 2 :: 3 :: 5 :: Nil)
    assert(resolver.atkinSieve(5).size === 3)

    assert(resolver.atkinSieve(10) === 2 :: 3 :: 5 :: 7 :: Nil)
    assert(resolver.atkinSieve(10).size === 4)

    assert(resolver.atkinSieve(110000)(10000) === 104743)
  }

  test("isPrime") {
    assert(resolver.isPrime(5) === true)
    assert(resolver.isPrime(6) === false)
    assert(resolver.isPrime(103843) === true)
  }

  test("resolve") {
    assert(resolver.resolve(6) === 13)
    assert(resolver.resolve(10001) === 104743)
  }

  test("test stream") {
    assert(resolver.nextPrime().take(3).toList === List(2, 3, 5))
    assert(resolver.nextPrime().take(5).toList === List(2, 3, 5, 7, 11))
    assert(resolver.nextPrime().take(10001).toList.reverse.head === 104743)
    assert(resolver.nextPrime().take(100001).toList.reverse.head === 1299721)
    assert(resolver.nextPrime().take(1000001).toList.reverse.head === 15485867)
  }
}
