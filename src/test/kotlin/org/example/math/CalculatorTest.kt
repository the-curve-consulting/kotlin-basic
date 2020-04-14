package org.example.math

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class CalculatorTest {

    private lateinit var calculator: Calculator

    @BeforeEach
    fun setupCalculator() {
        calculator = Calculator()
    }

    @Test
    fun `Dividing 72 by 6 gives 12`() {
        assertEquals(12.0, calculator.divide(72.0, 6.0));
    }

}
