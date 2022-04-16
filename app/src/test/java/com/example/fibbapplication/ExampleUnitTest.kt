package com.example.fibbapplication

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun zero_isCorrerct() {
        assertEquals(0, FibMethod().Fibonnacci(0))
    }

    @Test
    fun integers_areCorrect1() {
        assertEquals(2, FibMethod().Fibonnacci(3))
    }

    @Test
    fun integers_areCorrect2() {
        assertEquals(34, FibMethod().Fibonnacci(9))
    }

    @Test
    fun negative_isCorrerct() {
        assertEquals(-1, FibMethod().Fibonnacci(-1))
    }

    @Test
    fun letters_areCorrerct() {
        assertEquals("Error, not integers", FibMethod().Fibonnacci("n"))
    }

    @Test
    fun doubles_areCorrerct() {
        assertEquals("Error, not integers", FibMethod().Fibonnacci(3.1))
    }
}