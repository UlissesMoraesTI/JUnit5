package br.com.comotestar.JUnit5;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao() {
        LOGGER.info("Iniciou conexao");
    }

    public static void finallizarConexao() {
        LOGGER.info("Finalizou Conexao");
    }

    public static void insertDados(Pessoa pessoa) {
        LOGGER.info("Insert Pessoa");
    }

    public static void deleteDados(Pessoa pessoa) {
        LOGGER.info("Delete Pessoa");
    }
}
