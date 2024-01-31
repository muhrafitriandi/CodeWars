package kyu8

import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class ReduceButGrowTest {
    @Test
    fun exampleTests() {
        assertEquals(6, grow(intArrayOf(1, 2, 3)))
        assertEquals(16, grow(intArrayOf(4, 1, 1, 1, 4)))
        assertEquals(64, grow(intArrayOf(2, 2, 2, 2, 2, 2)))
    }
}

// Simple:
fun grow(arr: IntArray): Int = arr.reduce { acc, i -> acc * i}

// Manual:
//fun grow(arr: IntArray): Int {
//    var result = 1
//    arr.forEach {
//        result *= it
//    }
//    return result
//}

// Beginner - Reduce but Grow: https://www.codewars.com/kata/57f780909f7e8e3183000078