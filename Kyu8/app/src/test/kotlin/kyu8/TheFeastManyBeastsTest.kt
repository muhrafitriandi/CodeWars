package kyu8

import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class TheFeastManyBeastsTest {
    @Test
    fun testFixed() {
        assertEquals(true, feast("great blue heron", "garlic naan"))
        assertEquals(true, feast("chickadee", "chocolate cake"))
        assertEquals(false, feast("brown bear", "bear claw"))
        assertEquals(true, feast("marmot", "mulberry tart"))
        assertEquals(true, feast("porcupine", "pie"))
        assertEquals(false, feast("electric eel", "lasagna"))
        assertEquals(true, feast("slow loris", "salsas"))
        assertEquals(true, feast("ox", "orange lox"))
        assertEquals(true, feast("blue-footed booby", "blueberry"))
    }
}

// Simple:
fun feast(beast: String, dish: String): Boolean = beast.first() == dish.first() && beast.last() == dish.last()

// Manual:
//fun feast(beast: String, dish: String): Boolean {
//    val firstAndLastCharBeast = beast.removeRange(1, beast.lastIndex)
//    val firstAndLastCharDish = dish.removeRange(1, dish.lastIndex)
//    return firstAndLastCharBeast == firstAndLastCharDish
//}

// The Feast of Many Beasts: https://www.codewars.com/kata/5aa736a455f906981800360d