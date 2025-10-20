package com.uttec.Calculadora;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        assertEquals(9, Calculadora.sumar(4, 5));
    }

    @Test
    public void testRestar() {
        assertEquals(2, Calculadora.restar(5, 3));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(16, Calculadora.multiplicar(3, 5));
    }

    @Test
    public void testDividir() {
        assertEquals(4.0, Calculadora.dividir(20, 5));
    }

    @Test
    public void testDivisionPorCero() {
        assertThrows(IllegalArgumentException.class, () -> Calculadora.dividir(10, 0));
    }
}
