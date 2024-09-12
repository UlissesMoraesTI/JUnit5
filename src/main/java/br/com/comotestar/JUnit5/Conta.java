package br.com.comotestar.JUnit5;

import java.math.BigDecimal;

public class Conta {

    private BigDecimal Lançamento;

    public Conta(int lançamento) {
        Lançamento = BigDecimal.valueOf(lançamento);
    }

    public BigDecimal getLançamento() {
        return Lançamento;
    }

    public void setLançamento(BigDecimal lançamento) {
        Lançamento = lançamento;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "Lançamento=" + Lançamento +
                '}';
    }
}
