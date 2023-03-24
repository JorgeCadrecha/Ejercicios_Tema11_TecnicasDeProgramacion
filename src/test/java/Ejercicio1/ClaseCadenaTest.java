package Ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

class ClaseCadenaTest {

    @org.junit.jupiter.api.Test
    void devuelveIniciales() {
        assertEquals("A.D.", ClaseCadena.devuelveIniciales("Andreas Dulac"));
        assertEquals("p.w.", ClaseCadena.devuelveIniciales("paul walker"));
        assertEquals("", ClaseCadena.devuelveIniciales(""));
        assertEquals("", ClaseCadena.devuelveIniciales(null));
        assertEquals("Q.", ClaseCadena.devuelveIniciales("Quevedo"));
    }
}