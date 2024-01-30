package kyu8

import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class StringRepeatTest {
    @Test
    fun test4a() {
        assertEquals("aaaa", repeatStr(4, "a"))
    }

    @Test
    fun test3Hello() {
        assertEquals("HelloHelloHello", repeatStr(3, "Hello"))
    }

    @Test
    fun test5empty() {
        assertEquals("", repeatStr(5, ""))
    }

    @Test
    fun test0kata() {
        assertEquals("", repeatStr(0, "kata"))
    }
}

fun repeatStr(r: Int, str: String) : String = str.repeat(r)

//fun repeatStr(r: Int, str: String) : String {
//    var result = ""
//    (1..r).forEach { _ ->
//        result += str
//    }
//    return result
//}

// String repeat: https://www.codewars.com/kata/57a0e5c372292dd76d000d7e