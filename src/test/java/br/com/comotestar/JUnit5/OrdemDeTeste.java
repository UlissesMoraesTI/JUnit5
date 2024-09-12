package br.com.comotestar.JUnit5;

import org.junit.jupiter.api.*;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class OrdemDeTeste {

    @DisplayName("Fluxo DA")
    @Order(4)
    @Test
    void validarFluxoA() {
        Assumptions.assumeTrue(true);
    }

    @DisplayName("Fluxo CB")
    @Order(3)
    @Test
    void validarFluxoB() {
        Assumptions.assumeTrue(true);
    }

    @DisplayName("Fluxo BC")
    @Order(2)
    @Test
    void validarFluxoC() {
        Assumptions.assumeTrue(true);
    }

    @DisplayName("Fluxo AD")
    @Order(1)
    @Test
    void validarFluxoD() {
        Assumptions.assumeTrue(true);
    }
}
