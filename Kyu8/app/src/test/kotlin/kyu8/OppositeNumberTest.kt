package kyu8

import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class OppositeNumberTest {
    @Test
    fun testFixed() {
        assertEquals(-1, opposite(1));
        assertEquals(0, opposite(0));
        assertEquals(25, opposite(-25));
    }
}

fun opposite(number: Int): Int = number.unaryMinus()

// Opposite number: https://www.codewars.com/kata/56dec885c54a926dcd001095