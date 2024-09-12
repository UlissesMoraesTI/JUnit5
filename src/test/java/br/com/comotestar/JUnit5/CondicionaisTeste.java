package br.com.comotestar.JUnit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class CondicionaisTeste {

    @DisplayName("Validar Meu UserID")
    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "Ulisses")
    void validarMeuUserID() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @DisplayName("Desabilitar Teste, caso o usuário seja root")
    @Test
    @DisabledIfEnvironmentVariable(named = "USER", matches = "root")
    void validarUserIdRoot() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @DisplayName("Desabilitar teste, caso seja MAC")
    @Test
    @EnabledOnOs(OS.MAC)
    void validarSistemaOperacional() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @DisplayName("Desabilitar teste, caso seja MAC ou LINUX")
    @Test
    @EnabledOnOs({OS.MAC, OS.LINUX})
    void validarArrayDeSistemasOperacionais() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @DisplayName("Desabilitar por JDK")
    @Test
    @EnabledOnJre(JRE.JAVA_8)
    void validarJKD() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @DisplayName("Entre JKD8 e JDK17")
    @Test
    @EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_17)
    void validarRangeJKD() {
        Assertions.assertEquals(10, 5 + 5);
    }

}
