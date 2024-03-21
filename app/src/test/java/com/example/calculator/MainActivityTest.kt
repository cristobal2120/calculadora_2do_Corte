package com.example.calculator

import com.example.calculator.MainActivity.Companion.calcularPotencia
import com.example.calculator.MainActivity.Companion.calculardiv
import com.example.calculator.MainActivity.Companion.calcularmulti
import com.example.calculator.MainActivity.Companion.calcularresta
import com.example.calculator.MainActivity.Companion.calcularsuma
import org.junit.Assert
import org.junit.Test

class MainActivityTest {
    @Test
    fun calcularPotencia() {
        val result = calcularPotencia(2, 3)
        Assert.assertEquals(8, result.toLong())
    }

    @Test
    fun calcularS() {
        val result = calcularsuma(5.2, 3.0)
        Assert.assertEquals(8.2, result, 0.001) // Allow for small floating-point differences
    }

    @Test
    fun calcularR() {
        val result = calcularresta(5.0, 3.0)
        Assert.assertEquals(2.0, result, 0.001)
    }

    @Test
    fun calcularM() {
        val result = calcularmulti(5.0, 3.0)
        Assert.assertEquals(15.0, result, 0.001)
    }

    @Test
    fun calcularD() {
        val result = calculardiv(6.0, 3.0)
        Assert.assertEquals(2.0, result, 0.001)
    }
}