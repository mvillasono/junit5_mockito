package org.cmvilla.junit5.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {

    @Test
    void testNombreCuenta(){
        Cuenta cuenta = new Cuenta("Martin" , new BigDecimal("1000.12345"));
        String esperado = "Martin";
        String real = cuenta.getPersona();

        assertEquals(esperado, real);
        assertTrue(real.equals("Martin"));
    }
}