package pl.iogreen.euler.kotlin

import org.junit.Test
import kotlin.test.assertEquals

public class Problem002Test {

    val solver = Problem002()

    Test fun testSimpleCase() {
        assertEquals(2, solver.solve(5))
        assertEquals(10, solver.solve(10))
        assertEquals(44, solver.solve(100))
        assertEquals(798, solver.solve(1000))
        assertEquals(3382, solver.solve(10000))
        assertEquals(60696, solver.solve(100000))
        assertEquals(1089154, solver.solve(1000000))
        assertEquals(4613732, solver.solve(4000000))
    }

}