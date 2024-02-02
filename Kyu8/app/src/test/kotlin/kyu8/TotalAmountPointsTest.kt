package kyu8

import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

internal class TotalAmountPointTests {
    @Test
    fun basicTests() {
        printAndAssert(30, listOf("1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3"))
        printAndAssert(10, listOf("1:1", "2:2", "3:3", "4:4", "2:2", "3:3", "4:4", "3:3", "4:4", "4:4"))
        printAndAssert(0, listOf("0:1", "0:2", "0:3", "0:4", "1:2", "1:3", "1:4", "2:3", "2:4", "3:4"))
        printAndAssert(15, listOf("1:0", "2:0", "3:0", "4:0", "2:1", "1:3", "1:4", "2:3", "2:4", "3:4"))
        printAndAssert(12, listOf("1:0", "2:0", "3:0", "4:4", "2:2", "3:3", "1:4", "2:3", "2:4", "3:4"))
    }

    private fun printAndAssert(expected: Int, games: List<String>) {
        println("Testing for games: $games")
        assertEquals(expected, points(games))
    }
}

// Simple:
fun points(games: List<String>): Int = games.sumBy {
    val (x, y) = it.split(":")
    when {
        x > y -> 3
        x < y -> 0
        else -> 1
    }
}

// Manual:
//fun points(games: List<String>): Int {
//    var points = 0
//    games.forEach {
//        points += when {
//            it.first() > it.last() -> 3
//            it.first() < it.last() -> 0
//            else -> 1
//        }
//    }
//    return points
//}

// Total amount of points: https://www.codewars.com/kata/5bb904724c47249b10000131