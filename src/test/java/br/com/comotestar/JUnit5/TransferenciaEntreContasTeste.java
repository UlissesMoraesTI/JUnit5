package br.com.comotestar.JUnit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TransferenciaEntreContasTeste {

    @DisplayName("Exception na Transferência")
    @Test
    void validarExceptionTransferencia() {
        Conta contaOrigem = new Conta(0);
        Conta contaDestino = new Conta(100);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, () ->
                transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));
    }
}
