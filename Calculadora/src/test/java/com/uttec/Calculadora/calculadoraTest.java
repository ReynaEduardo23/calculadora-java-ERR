package com.uttec.Calculadora;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class calculadoraTest {

    @Test
    public void testSumar() {
        assertEquals(9, calculadora.sumar(4, 5));
    }

    @Test
    public void testRestar() {
        assertEquals(2, calculadora.restar(5, 3));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(15, calculadora.multiplicar(3, 5));
    }

    @Test
    public void testDividir() {
        assertEquals(4.0, calculadora.dividir(20, 5));
    }

    @Test
    public void testDivisionPorCero() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.dividir(10, 0));
    }
}
