package pl.iogreen.euler

import collection.mutable.ListBuffer

class Problem002 {

  def resolve(maxValue: Int): Int = {
    //    fibonacci(maxValue).filter(isEven(_)).sum
    betterFibonacci(maxValue).filter(isEven(_)).sum
  }

  def fibonacci(maxValue: Int): List[Int] = {
    val foundFibonacci = ListBuffer[Int](0, 1)
    var nValue = 1
    var nPlusOneValue = 1

    while (nValue < maxValue) {
      val tempValue = nValue
      nValue = nextFibo(nValue, nPlusOneValue)
      nPlusOneValue = tempValue
      foundFibonacci.append(tempValue)
    }

    foundFibonacci.drop(2).toList
  }

  def betterFibonacci(maxValue: Int): List[Int] = {
    def fib(a: Int = 0, b: Int = 1): Stream[Int] = {
      Stream.cons(a, fib(b, a + b))
    }
    fib().takeWhile(_ < maxValue).toList.drop(2)
  }

  def isEven(n: Int): Boolean = {
    n % 2 == 0
  }

  def nextFibo(x: Int, y: Int): Int = {
    x + y
  }
}