package br.com.comotestar.JUnit5;

public class TransferenciaEntreContas {

    public void transfere(Conta contaOrigem, Conta contaDestino, int valor) {
        if(valor <= 0) {
            throw new IllegalArgumentException("Valor Inválido para Transferência.");
        }
    }
}
