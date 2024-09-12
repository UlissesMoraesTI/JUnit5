package br.com.comotestar.JUnit5;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class BancoDeDadosTest {

    @DisplayName("Iniciar Conexão, executa uma única vez")
    @BeforeAll
    static void configuraConexao() {
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void insertDadosJao() {
        BancoDeDados.insertDados(new Pessoa("Jão", LocalDateTime.of(2000, 1, 1, 10, 15, 20)));
    }

    @BeforeEach
    void excluirDadosJao() {
        BancoDeDados.deleteDados(new Pessoa("Jão", LocalDateTime.of(2000, 1, 1, 10, 15, 20)));
    }

    @DisplayName("Validar Dados Retorno_1")
    @Test
    void validarDadosDeRetorno() {
        Assertions.assertTrue(true);
    }

    @DisplayName("Validar Dados Retorno_2")
    @Test
    void validarDadosRetorno2() {
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void finalizarConexao() {
        BancoDeDados.finallizarConexao();

    }
}
