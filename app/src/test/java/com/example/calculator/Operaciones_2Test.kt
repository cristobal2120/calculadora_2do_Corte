package com.example.calculator

import com.example.calculator.Operaciones_2.Companion.factorial
import org.junit.Assert
import org.junit.Test

class Operaciones_2Test {
    @Test
    fun calcularFactorial() {
        val resultado = factorial(5).toLong()
        Assert.assertEquals(120, resultado)
    }
}