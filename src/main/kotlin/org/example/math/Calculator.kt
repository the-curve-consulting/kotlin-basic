package org.example.math

class Calculator {
    fun add(value1: Double, value2: Double) : Double {
        return value1 + value2
    }

    fun subtract(value1: Double, value2: Double) : Double {
        return value1 - value2
    }

    fun multiply(value1: Double, value2: Double) : Double {
        return value1 * value2
    }

    fun divide(value1: Double, value2: Double) : Double {
        return value1 / value2
    }

    fun sum(values: Collection<Double>): Double {
        return values.sum();
    }

}
