package kyu8

import org.junit.jupiter.api.Assertions.assertArrayEquals
import kotlin.test.Test

class LostWithoutMapTest {
    @Test
    fun `Basic Tests`() {
        assertArrayEquals(intArrayOf(2, 4, 6), maps(intArrayOf(1, 2, 3)))
        assertArrayEquals(intArrayOf(8, 2, 2, 2, 8), maps(intArrayOf(4, 1, 1, 1, 4)))
        assertArrayEquals(intArrayOf(4, 4, 4, 4, 4, 4), maps(intArrayOf(2, 2, 2, 2, 2, 2)))
    }
}

// Simple:
fun maps(x: IntArray): IntArray = x.map { it * 2 }.toIntArray()

// Manual:
//fun maps(x: IntArray): IntArray {
//    var result = intArrayOf()
//    x.forEach {
//        result += it * 2
//    }
//    return result
//}

// Beginner - Lost Without a Map: https://www.codewars.com/kata/57f781872e3d8ca2a000007e