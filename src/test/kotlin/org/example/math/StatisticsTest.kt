package org.example.math

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class StatisticsTest {

    private lateinit var statistics: Statistics

    @BeforeEach
    fun setupCalculator() {
        statistics = Statistics()
    }
    @Test
    fun `average returns 6 when 2,3,3,5,7,10 are provided`() {
        assertEquals(5.0, statistics.average(listOf(2.0, 3.0, 3.0, 5.0, 7.0, 10.0)));
    }

}
