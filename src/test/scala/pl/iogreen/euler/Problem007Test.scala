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

}
