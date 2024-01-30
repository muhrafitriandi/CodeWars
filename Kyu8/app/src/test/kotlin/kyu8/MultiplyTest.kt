package kyu8

import kotlin.test.assertEquals
import org.junit.jupiter.api.*

class MultiplyTest {
    @Test
    fun basicTests() {
        assertEquals(1.0, multiply(1.0, 1.0), "1.0 * 1.0 == 1.0")
        assertEquals(2.0, multiply(2.0, 1.0), "2.0 * 1.0 == 2.0")
        assertEquals(4.0, multiply(2.0, 2.0), "2.0 * 2.0 == 4.0")
        assertEquals(15.0, multiply(3.0, 5.0), "3.0 * 5.0 == 15.0")
        assertEquals(0.25, multiply(0.5, 0.5), "0.5 * 0.5 == 0.25")
        assertEquals(0.0, multiply(5.0, 0.0), "5.0 * 0.0 == 0.0")
        assertEquals(0.0, multiply(0.0, 5.0), "0.0 * 5.0 == 0.0")
        assertEquals(0.0, multiply(0.0, 0.0), "0.0 * 0.0 == 0.0")
    }
}

fun multiply(x: Double, y: Double) = x * y

// Multiply: https://www.codewars.com/kata/50654ddff44f800200000004