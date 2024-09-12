package br.com.comotestar.JUnit5;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AssumptionsTeste {

    @DisplayName("Validar Meu Usuário!")
    @Test
    void validarMeuUsuario() {
        Assumptions.assumeTrue("Ulisses".equals(System.getenv("USER")));
    }

    @DisplayName("Validar Falso Usuário!")
    @Test
    void validarFalsoUsuario() {
        Assumptions.assumeFalse("Ulisses".equals(System.getenv("USER")));
    }


}
