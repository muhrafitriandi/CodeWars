package kyu8

import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class ConvertNumberToStringTest {
    @Test
    fun testFixed() {
        assertEquals("67", numberToString(67))
        assertEquals("123", numberToString(123))
        assertEquals("999", numberToString(999))
    }
}

fun numberToString(num: Int): String = num.toString()

// Convert a Number to a String!: https://www.codewars.com/kata/5265326f5fda8eb1160004c8