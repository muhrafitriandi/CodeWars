package kyu8

import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class SquareSumTest {
    @Test
    fun `Sum of Squared Inputs`() {
        assertEquals(5, squareSum(arrayOf(1, 2)))
        assertEquals(50, squareSum(arrayOf(0, 3, 4, 5)))
        assertEquals(0, squareSum(arrayOf()))
    }
}

// Simple:
//fun squareSum(n: Array<Int>): Int = n.sumOf { it * it }

// Manual:
fun squareSum(n: Array<Int>): Int {
    var result = 0
    n.forEach {
        result += it * it
    }
    return result
}

// Square(n) Sum: https://www.codewars.com/kata/515e271a311df0350d00000f