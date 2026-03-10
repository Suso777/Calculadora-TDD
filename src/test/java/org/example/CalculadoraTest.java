package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    Calculadora calc = new Calculadora();

    @Test
    void add_shouldAddCorrectly() {
        assertEquals(15, calc.sumar(10, 5));
    }

    @Test
    void subtract_shouldSubtractCorrectly() {
        assertEquals(5, calc.restar(10, 5));
    }

    @Test
    void multiply_shouldMultiplyCorrectly() {
        assertEquals(50, calc.multiplicar(10, 5));
    }

    @Test
    void divide_shouldDivideCorrectly() {
        assertEquals(2, calc.dividir(10, 5));
    }

    @Test
    void divide_shouldThrowExceptionWhenDividingByZero() {
        assertThrows(IllegalArgumentException.class, () -> calc.dividir(10, 0));
    }

    @Test
    void add_shouldAddNegativeNumbers() {
        assertEquals(-15, calc.sumar(-10, -5));
    }

    @Test
    void add_shouldAddPositiveAndNegativeNumbers() {
        assertEquals(5, calc.sumar(10, -5));
    }

    @Test
    void subtract_shouldSubtractNegativeNumbers() {
        assertEquals(-5, calc.restar(-10, -5));
    }

    @Test
    void subtract_shouldSubtractPositiveAndNegativeNumbers() {
        assertEquals(15, calc.restar(10, -5));
    }


    @Test
    void multiply_shouldMultiplyByZero() {
        assertEquals(0, calc.multiplicar(10, 0));
    }

    @Test
    void multiply_shouldMultiplyNegativeNumbers() {
        assertEquals(50, calc.multiplicar(-10, -5));
    }

    @Test
    void multiply_shouldMultiplyPositiveAndNegativeNumbers() {
        assertEquals(-50, calc.multiplicar(10, -5));
    }

    @Test
    void divide_shouldDivideNegativeNumbers() {
        assertEquals(2, calc.dividir(-10, -5));
    }

    @Test
    void divide_shouldDividePositiveAndNegativeNumbers() {
        assertEquals(-2, calc.dividir(10, -5));
    }


    @Test
    void divide_shouldHandleDecimals() {
        assertEquals(2.5, calc.dividir(5, 2));
    }

    @Test
    void add_shouldAddDecimals() {
        assertEquals(7.7, calc.sumar(3.2, 4.5));
    }

    @Test
    void subtract_shouldSubtractDecimals() {
        assertEquals(-1.3, calc.restar(3.2, 4.5));
    }

    @Test
    void multiply_shouldMultiplyDecimals() {
        assertEquals(14.4, calc.multiplicar(3.2, 4.5));
    }

    @Test
    void divide_shouldDivideDecimals() {
        assertEquals(0.7111111111111111, calc.dividir(3.2, 4.5));
    }

    @Test
    void divide_shouldThrowExceptionWithLargeNumbers() {
        assertThrows(IllegalArgumentException.class, () -> calc.dividir(1000, 0));
    }
}
