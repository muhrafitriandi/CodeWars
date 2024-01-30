package kyu8

import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class RemoveFirstLastCharacterTest {
    @Test
    fun basicTests() {
        assertEquals("loquen", removeChar("eloquent"))
        assertEquals("ountr", removeChar("country"))
        assertEquals("erso", removeChar("person"))
        assertEquals("lac", removeChar("place"))
    }
}

fun removeChar(str: String): String = str.substring(1, str.lastIndex)

// Remove First and Last Character: https://www.codewars.com/kata/56bc28ad5bdaeb48760009b0