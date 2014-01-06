package pl.iogreen.euler.kotlin

public class Problem002 {

    fun solve(n: Int): Int {
        val zero = 0.toLong()

        var prev: Long = 1
        var curr: Long = 2
        var sum = 2

        while (true ) {
            val tmp = curr
            curr = curr + prev
            prev = tmp

            if (curr > n) {
                return sum
            } else if (curr % 2 == zero) {
                sum += curr
            }
        }
    }
}