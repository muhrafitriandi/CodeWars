package kyu8

import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class IsHeGonnaSurviveTest {
    @Test
    fun testFixed() {
        assertEquals(true, hero(10, 5))
        assertEquals(false, hero(7, 4))
        assertEquals(false, hero(4, 5))
        assertEquals(true, hero(100, 40))
        assertEquals(false, hero(1500, 751))
        assertEquals(false, hero(0, 1))
    }
}

fun hero(bullets: Int, dragons: Int): Boolean = bullets >= dragons * 2

// Is he gonna survive?: https://www.codewars.com/kata/59ca8246d751df55cc00014c