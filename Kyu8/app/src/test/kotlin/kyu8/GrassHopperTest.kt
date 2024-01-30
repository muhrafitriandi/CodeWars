package kyu8

import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class GrassHopperTest {
    @Test
    fun test1() {
        assertEquals(1, GrassHopper.summation(1))
    }

    @Test
    fun test2() {
        assertEquals(36, GrassHopper.summation(8))
    }
}

object GrassHopper {
    fun summation(n: Int): Int = (1..n).sum()

//    fun summation(n: Int): Int {
//        var result = 0
//        (1..n).forEach {
//            result += it
//        }
//        return result
//    }
}

// Grasshopper - Summation: https://www.codewars.com/kata/55d24f55d7dd296eb9000030