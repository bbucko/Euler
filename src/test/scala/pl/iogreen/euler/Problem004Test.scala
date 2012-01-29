package pl.iogreen.euler

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

@RunWith(classOf[JUnitRunner])
class Problem004Test extends FunSuite {

  val resolver = new Problem004()

  test("is palindrome") {
    assert(resolver.isPalindrom("9009") === true)
    assert(resolver.isPalindrom("90009") === true)
    assert(resolver.isPalindrom("9001009") === true)
    assert(resolver.isPalindrom("9102019") === true)

    assert(resolver.isPalindrom("900119") === false)
  }

  test("test resolver") {
    assert(resolver.resolve(10, 99) === 9009)
    assert(resolver.resolve(100, 999) === 906609)
  }

}
