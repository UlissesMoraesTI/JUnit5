package br.com.comotestar.JUnit5;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class ContaTeste {

    @DisplayName("01-Lançamentos em Duplicidade?")
    @Test
    void validarLancamentosEmDuplicidade() {
        int[] lancamento1 = {10, 15, 20};
        int[] lancamento2 = {10, 15, 20};
        Assertions.assertArrayEquals(lancamento1, lancamento2);
    }

    @DisplayName("02-Lançamentos São Iguais?")
    @Test
    void validarLancamentosIguais() {
        int[] lancamento1 = {10, 15, 20};
        int[] lancamento2 = {10, 15, 20};
        Assertions.assertNotEquals(lancamento1, lancamento2);
    }

    @DisplayName("03-Valores BIG São iguais?")
    @Test
    void validarValoresBigIguais() {
        BigDecimal valorCredito = BigDecimal.valueOf(5.0);
        BigDecimal valorDebito  = BigDecimal.valueOf(5.0);
        Assertions.assertEquals(valorCredito, valorDebito);
    }

    @DisplayName("04-Valores São iguais?")
    @Test
    void validarValoresIguais() {
        Double valorCredito = 5.0;
        Double valorDebito  = 5.0;
        Assertions.assertEquals(valorCredito, valorDebito);
    }
}
