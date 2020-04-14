package org.example.math

import io.mockk.clearAllMocks
import io.mockk.every
import io.mockk.junit5.MockKExtension
import io.mockk.mockk
import io.mockk.verify
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(MockKExtension::class)
class StatisticsTest {

    private lateinit var statistics: Statistics
    private lateinit var calculator: Calculator

    @BeforeEach
    fun setup() {
        clearAllMocks()
        calculator = mockk<Calculator> {
            every { sum(any()) }.returns(30.0)
            every { divide(30.0, 6.0)}.returns(5.0)
        }
        statistics = Statistics(calculator)
    }

    @Nested
    inner class Average {
        @Test
        fun `average returns 6 when 2,3,3,5,7,10 are provided`() {
            assertThat(statistics.average(listOf(2.0, 3.0, 3.0, 5.0, 7.0, 10.0))).isEqualTo(5.0)
            verify {
                calculator.sum(listOf(2.0, 3.0, 3.0, 5.0, 7.0, 10.0))
            }
        }
    }

}
