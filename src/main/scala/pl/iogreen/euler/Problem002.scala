package pl.iogreen.euler

import collection.mutable.ListBuffer

class Problem002 {

  def resolve(maxValue: Int): Int = {
    fibonacci(maxValue).filter(isEven(_)).sum
  }

  def fibonacci(maxValue: Int): List[Int] = {
    val foundFibonacci = ListBuffer[Int]()
    var nValue = 0
    var nPlusOneValue = 1

    while (nValue < maxValue) {
      val tempValue = nValue
      nValue = nextFibo(nValue, nPlusOneValue)
      nPlusOneValue = tempValue
      foundFibonacci.append(tempValue)
    }

    foundFibonacci.drop(2).toList
  }

  def isEven(n: Int): Boolean = {
    n % 2 == 0
  }

  def nextFibo(x: Int, y: Int): Int = {
    x + y
  }
}