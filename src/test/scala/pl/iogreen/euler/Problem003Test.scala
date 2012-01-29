package pl.iogreen.euler

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite
import java.math.BigInteger

@RunWith(classOf[JUnitRunner])
class Problem003Test extends FunSuite {

  def resolver = new Problem003

  test("find prime factor of n") {
    assert(resolver.primeFactors(13195) === List(5, 7, 13, 29))
  }

  test("find primes sieve") {
    assert(resolver.primesSieve(10) === List(2, 3, 5, 7))
  }

  test("find largest prime factor of n") {
    assert(resolver.resolve(13195) === 29)
    assert(resolver.resolve(new BigInt(new BigInteger("600851475143"))) === 42)
  }


}