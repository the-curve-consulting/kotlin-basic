package org.example.math

import io.mockk.every
import io.mockk.junit5.MockKExtension
import io.mockk.mockk
import io.mockk.verify
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(MockKExtension::class)
class StatisticsTest {

    private lateinit var statistics: Statistics
    private lateinit var calculator: Calculator

    @Test
    fun `average returns 6 when 2,3,3,5,7,10 are provided`() {
        calculator = mockk<Calculator> {
            every { sum(any()) }.returns(60.0)
            every { divide(60.0, 6.0)}.returns(10.0)
        };
        statistics = Statistics(calculator);

        // All of these values add up to 30, but we've mocked the sum method to return 60! Therefore 60 / 6 = 10
        // We've done this to prove that the mock value is being returned and not the real value of 5
        assertThat(statistics.average(listOf(2.0, 3.0, 3.0, 5.0, 7.0, 10.0))).isEqualTo(10.0);
        verify {
            calculator.sum(listOf(2.0, 3.0, 3.0, 5.0, 7.0, 10.0))
        }
    }

}
