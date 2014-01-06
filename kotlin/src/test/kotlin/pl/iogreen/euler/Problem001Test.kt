package pl.iogreen.euler.kotlin

import org.junit.Test
import kotlin.test.assertEquals

public class Problem001Test {

    val solver = Problem001()

    Test fun testSimpleCase() {
        assertEquals(23, solver.solver(10))
        assertEquals(233168, solver.solver(1000))
    }

}