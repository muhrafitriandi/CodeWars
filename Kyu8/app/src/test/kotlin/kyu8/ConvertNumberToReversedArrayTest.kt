package kyu8

import org.junit.jupiter.api.Assertions.assertArrayEquals
import kotlin.test.Test

class ConvertNumberToReversedArrayTest {
    @Test
    fun tests() {
        assertArrayEquals(intArrayOf(1, 3, 2, 5, 3), Kata2.digitize(35231))
        assertArrayEquals(intArrayOf(0), Kata2.digitize(0))
    }
}

object Kata2 {
    // Simple:
    fun digitize(n: Long): IntArray = n.toString().reversed().map { it.digitToInt() }.toIntArray()

    // Manual:
//    fun digitize(n: Long): IntArray {
//        val numToListChar = n.toString().toList()
//        val result = mutableListOf<Int>()
//        numToListChar.forEachIndexed { index, _ ->
//            result.add(numToListChar[numToListChar.size - 1 - index].digitToInt())
//        }
//
//        return result.toIntArray()
//    }
}

// Convert number to reversed array of digits: https://www.codewars.com/kata/5583090cbe83f4fd8c000051