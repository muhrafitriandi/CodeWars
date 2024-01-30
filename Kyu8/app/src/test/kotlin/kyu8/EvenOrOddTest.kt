package kyu8

import kotlin.test.assertEquals
import org.junit.jupiter.api.*

class EvenOrOddTest {

    @Test @DisplayName("Should return \"Odd\" for num = 1")
    fun testPositiveOddNumbers() {
        assertEquals("Odd", evenOrOdd(1))
    }

    @Test @DisplayName("Should return \"Even\" for num = 2")
    fun testPositiveEvenNumbers() {
        assertEquals("Even", evenOrOdd(2))
    }

    @Test @DisplayName("Should return \"Odd\" for num = -1")
    fun testNegativeOddNumbers() {
        assertEquals("Odd", evenOrOdd(-1))
    }

    @Test @DisplayName("Should return \"Even\" for num = -2")
    fun testNegativeEvenNumbers() {
        assertEquals("Even", evenOrOdd(-2))
    }

    @Test @DisplayName("Should return \"Even\" for num = 0")
    fun testZero() {
        assertEquals("Even", evenOrOdd(0))
    }
}

fun evenOrOdd(number: Int): String = if (number % 2 == 0) "Even" else "Odd"

// Even or Odd: https://www.codewars.com/kata/53da3dbb4a5168369a0000fe