package br.com.comotestar.JUnit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


@TestMethodOrder(MethodOrderer.DisplayName.class)
public class OrdemDisplayName {

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
