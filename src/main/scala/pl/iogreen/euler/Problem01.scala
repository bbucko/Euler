package pl.iogreen.euler

class Problem01 {

  def resolve(n: Int): Int = {
    (getMultipliers(n, 3) ::: getMultipliers(n, 5)).distinct.sum
  }

  def resolveBetter(n: Int): Int = {
    (1 until n).filter(p => isMultiplier(p, 3) || isMultiplier(p, 5)).sum
  }

  def resolveBetterPar(n: Int): Int = {
    (1 until n).par.filter(p => isMultiplier(p, 3) || isMultiplier(p, 5)).sum
  }

  def isMultiplier(n: Int, of: Int): Boolean = {
    n % of == 0
  }

  def getMultipliers(n: Int, of: Int): List[Int] = {
    (1 until n).filter(isMultiplier(_, of)).toList
  }
}