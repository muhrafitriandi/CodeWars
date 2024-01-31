package kyu8

import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class EnumerableMagicTest {
    @Test
    fun `Basic Tests`() {
        assertEquals(true, include(intArrayOf(1,2,3,4), 2))
        assertEquals(false, include(intArrayOf(1,2,4,5), 3))
    }
}

// Simple:
fun include(arr: IntArray, item : Int): Boolean = item in arr

// Manual:
//fun include(arr: IntArray, item : Int): Boolean {
//    var result = false
//    for (i in arr) {
//        if (i == item) {
//            result = true
//            break
//        }
//    }
//    return result
//}

// Enumerable Magic - Does My List Include This?: https://www.codewars.com/kata/545991b4cbae2a5fda000158