package com.example.mobile_testing

import org.junit.Assert.*
import org.junit.Test

class ExampleUnitTest {

    private val calculations = Calculations(4, 5)

    @Test
    fun addition_isCorrect() {
        assertEquals(9, calculations.addition())
    }

    @Test
    fun subtraction_isCorrect() {
        assertEquals(-1, calculations.subtraction())
    }

    @Test
    fun multiplication_isCorrect() {
        assertEquals(20, calculations.multiplication())
    }

    @Test
    fun division_isCorrect() {
        assertEquals(0, calculations.division()) // 4 / 5 = 0 (integer division)
    }
}