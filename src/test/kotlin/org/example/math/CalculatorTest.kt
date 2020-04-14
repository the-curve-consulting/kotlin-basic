package org.example.math

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test


class CalculatorTest {

    private lateinit var calculator: Calculator

    @BeforeEach
    fun setupCalculator() {
        calculator = Calculator()
    }

    @Test
    fun `Adding 1 and 2 results in 3`() {
        assertThat(calculator.add(1.0, 2.0)).isEqualTo(3.0);
    }

    @Test
    fun `Subtracting 7 from 12 results in 5`() {
        assertThat(calculator.subtract(12.0, 7.0)).isEqualTo(5.0);
    }

    @Test
    fun `Multiplying 12 and 8 gives 96`() {
        assertThat(calculator.multiply(8.0, 12.0)).isEqualTo(96.0);
    }

    @Test
    fun `Dividing 72 by 6 gives 12`() {
        assertThat(calculator.divide(72.0, 6.0)).isEqualTo(12.0);
    }

    @Test
    fun `Summing 3, 5, 7, 9, 11 gives 35`() {
        assertThat(calculator.sum(listOf(3.0, 5.0, 7.0, 9.0, 11.0))).isEqualTo(35.0);
    }
}
