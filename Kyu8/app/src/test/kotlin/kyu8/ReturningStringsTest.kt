package kyu8

import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class ReturningStringsTest {
    @Test
    fun `Basic tests`() {
        assertEquals("Hello, Ryan how are you doing today?", greet("Ryan"))
        assertEquals("Hello, Shingles how are you doing today?", greet("Shingles"))
    }
}

fun greet(name: String): String = "Hello, $name how are you doing today?"

// Returning Strings: https://www.codewars.com/kata/55a70521798b14d4750000a4