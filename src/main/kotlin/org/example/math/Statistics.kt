package org.example.math

class Statistics(private var calculator: Calculator) {
    fun average(values: Collection<Double>): Double {
        val total = calculator.sum(values)
        return calculator.divide(total, values.size.toDouble())
    }
}
