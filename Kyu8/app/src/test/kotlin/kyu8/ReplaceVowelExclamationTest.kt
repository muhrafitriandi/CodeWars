package kyu8

import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class ReplaceVowelExclamationTest {
    @Test
    fun testFixed() {
        assertEquals("H!!", replace("Hi!"))
        assertEquals("!H!! H!!", replace("!Hi! Hi!"))
        assertEquals("!!!!!", replace("aeiou"))
        assertEquals("!BCD!", replace("ABCDE"))
    }
}

// Simple:
fun replace(s: String): String = s.replace("[aiueoAIUEO]".toRegex(), "!")

// Manual:
//fun replace(s: String): String = s.map {
//    when (it.lowercase()) {
//        "a", "i", "u", "e", "o" -> "!"
//        else -> it
//    }
//}.joinToString("")

// Exclamation marks series #11: Replace all vowel to exclamation mark in the sentence: https://www.codewars.com/kata/57fb09ef2b5314a8a90001ed