package br.com.comotestar.JUnit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class PessoaTeste {

    @DisplayName("01-Jéssica Possui 24 Anos.")
    @Test
    void deveCalcularIdadeCorretamente() {
        Pessoa jessica = new Pessoa("Jessica", LocalDateTime.of(2000,1,1, 10, 15, 20));
        Assertions.assertEquals(24, jessica.getIdade());
    }

    @DisplayName("02-Pedro é maior de Idade.")
    @Test
    void deveRetornarSeEhMaiorDeIdade() {
        Pessoa pedro = new Pessoa("Pedro", LocalDateTime.of(2000,1,1, 10, 15, 20));
        Assertions.assertTrue(pedro.ehMaiorDeIdade());
    }

    @DisplayName("03-Luiz é menor de Idade.")
    @Test
    void deveRetornarSeEhMenorDeIdade() {
        Pessoa luiz = new Pessoa("Luiz", LocalDateTime.of(2020,1,1, 10, 15, 20));
        Assertions.assertFalse(luiz.ehMaiorDeIdade());
    }

    @DisplayName("04-Pessoa Nulla.")
    @Test
    void deveRetornarSeEhNull() {
        Pessoa pessoa = null;
        Assertions.assertNull(pessoa);
    }

    @DisplayName("05-Pessoa Não é Nulla.")
    @Test
    void deveRetornarNotNull() {
        Pessoa pessoa = new Pessoa("Julio", LocalDateTime.now());
        Assertions.assertNotNull(pessoa);
    }
}
