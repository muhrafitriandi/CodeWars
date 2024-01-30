package kyu8

import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class SumOfPositiveTest {
    @Test
    fun testSomething() {
        assertEquals(15, sum(intArrayOf(1, 2, 3, 4, 5)))
        assertEquals(13, sum(intArrayOf(1, -2, 3, 4, 5)))
        assertEquals(0, sum(intArrayOf()))
        assertEquals(0, sum(intArrayOf(-1, -2, -3, -4, -5)))
        assertEquals(9, sum(intArrayOf(-1, 2, 3, 4, -5)))
    }
}

fun sum(numbers: IntArray): Int = numbers.filter { it > 0 }.sum()

// Sum of Positive: https://www.codewars.com/kata/5715eaedb436cf5606000381