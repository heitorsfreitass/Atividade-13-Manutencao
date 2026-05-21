package br.edu.refactoring.estacionamento;

import java.math.BigDecimal;
import java.math.RoundingMode;

// Classe criada para manipulação do BigDecimal
public class ControleMonetario {
    private BigDecimal valor;

    public ControleMonetario(BigDecimal valor) {
        this.valor = valor;
    }

    public String formatarEmReais() {
        return "R$ " + valor.setScale(2, RoundingMode.HALF_UP).toString().replace(".", ",");
    }

    public boolean isAltoValor() {
        return valor.compareTo(new BigDecimal("50.00")) >= 0;
    }

    public BigDecimal toBigDecimal() {
        return valor;
    }
}
