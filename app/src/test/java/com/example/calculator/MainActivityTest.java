package com.example.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainActivityTest {

    @Test
    public void calcularPotencia() {
        int result = MainActivity.calcularPotencia(2, 3);
        assertEquals(8, result);
    }

    @Test
    public void calcularS() {
        double result = MainActivity.calcularsuma(5.2, 3);
        assertEquals(8.2, result, 0.001); // Allow for small floating-point differences
    }

    @Test
    public void calcularR() {
        double result = MainActivity.calcularresta(5, 3);
        assertEquals(2, result, 0.001);
    }

    @Test
    public void calcularM() {
        double result = MainActivity.calcularmulti(5, 3);
        assertEquals(15, result, 0.001);
    }

    @Test
    public void calcularD() {
        double result = MainActivity.calculardiv(6, 3);
        assertEquals(2, result, 0.001);
    }
}