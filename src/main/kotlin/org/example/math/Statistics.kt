package org.example.math

class Statistics {

    fun average(values: Collection<Double>): Double {
        val total = values.sum()
        return total / values.size.toDouble();
    }
}
