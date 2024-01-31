package kyu8

import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class WellIdeasTest {
    @Test
    fun `returns the correct string`() {
        assertEquals("Publish!", well(arrayOf("good", "bad", "bad")))
        assertEquals("Fail!", well(arrayOf("bad", "bad", "bad")))
        assertEquals("I smell a series!", well(arrayOf("good", "good", "good")))
    }
}

// Simple:
fun well(x: Array<String>): String = when (x.count { it == "good" }) {
    0 -> "Fail!"
    1, 2 -> "Publish!"
    else -> "I smell a series!"
}

// Manual:
//fun well(x: Array<String>): String {
//    val countGroupingByIdea = x.filter { it == "good" }
//    return when (countGroupingByIdea.size) {
//        0 -> "Fail!"
//        1, 2 -> "Publish!"
//        else -> "I smell a series!"
//    }
//}

// Well of Ideas - Easy Version: https://www.codewars.com/kata/57f222ce69e09c3630000212