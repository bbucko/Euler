package pl.iogreen.euler

import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class Problem01Test extends FunSuite {

  val resolver = new Problem01

  test("test finding multipliers") {
    assert(resolver.getMultipliers(10, 3) === List(3, 6, 9))
    assert(resolver.getMultipliers(10, 5) === List(5))
  }

  test("test checking multiplier") {
    assert(resolver.isMultiplier(5, 3) === false)
    assert(resolver.isMultiplier(6, 3) === true)

    assert(resolver.isMultiplier(5, 5) === true)
    assert(resolver.isMultiplier(6, 5) === false)
  }

  test("test simple resolver") {
    assert(resolver.resolve(10) === 23)
    assert(resolver.resolve(100) === 2318)
    assert(resolver.resolve(1000) === 233168)
    assert(resolver.resolve(10000) === 23331668)
  }

  test("test serial resolver") {
    assert(resolver.resolveBetter(10) === 23)
    assert(resolver.resolveBetter(100) === 2318)
    assert(resolver.resolveBetter(1000) === 233168)
    assert(resolver.resolveBetter(10000) === 23331668)
  }

  test("test parallel resolver") {
    assert(resolver.resolveBetterPar(10) === 23)
    assert(resolver.resolveBetterPar(100) === 2318)
    assert(resolver.resolveBetterPar(1000) === 233168)
    assert(resolver.resolveBetterPar(10000) === 23331668)
  }


  test("time parallel resolver for 10000000") {
    val n = 10000000

    val t0 = System.currentTimeMillis
    val simpleResolution = resolver.resolve(n)
    val simpleTime = System.currentTimeMillis - t0

    val t1 = System.currentTimeMillis
    val betterResolution = resolver.resolveBetter(n)
    val serialTime = System.currentTimeMillis - t1

    val t2 = System.currentTimeMillis
    val parallelResolution = resolver.resolveBetterPar(n)
    val parallelTime = System.currentTimeMillis - t2

    assert(simpleResolution === parallelResolution)
    assert(simpleResolution === betterResolution)

    assert(parallelTime < serialTime)
    assert(serialTime < simpleTime)
  }
}