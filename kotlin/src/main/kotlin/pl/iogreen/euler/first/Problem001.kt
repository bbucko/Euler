package pl.iogreen.euler.first

public class Problem001 {

    fun solver(n: Int): Int {
        return Array<Int>(n, { it }).filter { it % 3 == 0 || it % 5 == 0 }.sum()
    }

}