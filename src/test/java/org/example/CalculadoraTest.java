package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    Calculadora calc = new Calculadora();

    @Test
    void sumar_deberiaSumarCorrectamente() {
        assertEquals(15, calc.sumar(10, 5));
    }

    @Test
    void restar_deberiaRestarCorrectamente() {
        assertEquals(5, calc.restar(10, 5));
    }

    @Test
    void multiplicar_deberiaMultiplicarCorrectamente() {
        assertEquals(50, calc.multiplicar(10, 5));
    }

    @Test
    void dividir_deberiaDividirCorrectamente() {
        assertEquals(2, calc.dividir(10, 5));
    }

    @Test
    void dividir_deberiaLanzarExcepcionSiDivisorEsCero() {
        assertThrows(IllegalArgumentException.class, () -> calc.dividir(10, 0));
    }
}