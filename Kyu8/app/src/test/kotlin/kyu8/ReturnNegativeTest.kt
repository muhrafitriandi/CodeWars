package kyu8

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class ReturnNegativeTest {
    private lateinit var kata: Kata

    @BeforeEach
    fun setUp() {
        kata = Kata()
    }

    @Test
    fun test1() {
        assertEquals(-42, kata.makeNegative(42).toLong())
    }
}

class Kata {

    fun makeNegative(x: Int): Int = if (x > 0) 0 - x else x

    // Return Negative: https://www.codewars.com/kata/55685cd7ad70877c23000102
}