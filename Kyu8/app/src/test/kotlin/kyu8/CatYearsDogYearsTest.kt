package kyu8

import org.junit.jupiter.api.Assertions.assertArrayEquals
import kotlin.test.Test

class CatYearsDogYearsTest {
    @Test
    fun `one year`() {
        assertArrayEquals(arrayOf(1, 15, 15), calculateYears(1))
    }

    @Test
    fun `two years`() {
        assertArrayEquals(arrayOf(2, 24, 24), calculateYears(2))
    }

    @Test
    fun `ten years`() {
        assertArrayEquals(arrayOf(10, 56, 64), calculateYears(10))
    }
}

// Simple:
fun calculateYears(years: Int): Array<Int> =
    when (years) {
        1 -> arrayOf(1, 15, 15)
        2 -> arrayOf(2, 24, 24)
        else -> arrayOf(10, (24 + (4 * (years - 2))), (24 + (5 * (years - 2))))
    }

// Manual:
//fun calculateYears(years: Int): Array<Int> {
//    val catYears = (1..years).map {
//        when (it) {
//            1 -> 15
//            2 -> 9
//            else -> 4
//        }
//    }
//
//    val dogYears = (1..years).map {
//        when (it) {
//            1 -> 15
//            2 -> 9
//            else -> 5
//        }
//    }
//
//    return arrayOf(years, catYears.sum(), dogYears.sum())
//}


// Cat years, Dog years: https://www.codewars.com/kata/5a6663e9fd56cb5ab800008b