package br.com.comotestar.JUnit5;

import org.junit.jupiter.api.*;


@TestMethodOrder(MethodOrderer.MethodName.class)
public class OrdemPorName {

    @DisplayName("Fluxo DA")
    @Test
    void validarFluxoA() {
        Assumptions.assumeTrue(true);
    }

    @DisplayName("Fluxo CB")
    @Test
    void validarFluxoB() {
        Assumptions.assumeTrue(true);
    }

    @DisplayName("Fluxo BC")
    @Test
    void validarFluxoC() {
        Assumptions.assumeTrue(true);
    }

    @DisplayName("Fluxo AD")
    @Test
    void validarFluxoD() {
        Assumptions.assumeTrue(true);
    }
}
