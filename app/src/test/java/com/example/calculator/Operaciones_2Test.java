package com.example.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class Operaciones_2Test {


    @Test
    public void calcularFactorial() {
        long resultado= Operaciones_2.factorial(5);
        assertEquals(120,resultado);
    }
}