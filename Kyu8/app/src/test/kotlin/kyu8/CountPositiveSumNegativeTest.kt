package kyu8

import org.junit.jupiter.api.Assertions.assertArrayEquals
import kotlin.test.Test

class CountPositiveSumNegativeTest {
    @Test
    fun testFixed() {
        assertArrayEquals(arrayOf(10, -65), countPositivesSumNegatives(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15)))
        assertArrayEquals(arrayOf(8, -50), countPositivesSumNegatives(arrayOf(0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14)))
        assertArrayEquals(arrayOf(8, -50), countPositivesSumNegatives(arrayOf(0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14)))
    }
}

// Simple:
//fun countPositivesSumNegatives(input : Array<Int>?) : Array<Int> {
//    if (input.isNullOrEmpty()) return emptyArray()
//    val (positive, negative) = input.partition { it > 0 }
//
//    return arrayOf(positive.size, negative.sum())
//}

// Manual:
fun countPositivesSumNegatives(input : Array<Int>?) : Array<Int> {
    val positiveNumbers = mutableListOf<Int>()
    val negativeNumbers = mutableListOf<Int>()

    if (input.isNullOrEmpty()) return emptyArray()
    input.forEach {
        if (it > 0) positiveNumbers.add(it)
        else negativeNumbers.add(it)
    }

    return arrayOf(positiveNumbers.size, negativeNumbers.sum())
}

// Count of positives / sum of negatives: https://www.codewars.com/kata/576bb71bbbcf0951d5000044