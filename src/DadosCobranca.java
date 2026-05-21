package br.edu.refactoring.estacionamento;

public class DadosCobranca {

    private String banco;
    private String agencia;
    private String conta;
    private String metodoPagamentoPreferencial;

    public DadosCobranca(String banco, String agencia, String conta, String metodoPagamentoPreferencial) {
        this.banco = banco;
        this.agencia = agencia;
        this.conta = conta;
        this.metodoPagamentoPreferencial = metodoPagamentoPreferencial;
    }

    public String getFormatado() {
        return banco + " | Agência " + agencia + " | Conta " + conta
                + " | Método preferencial: " + metodoPagamentoPreferencial;
    }

    public String getBanco() { return banco; }
    public String getAgencia() { return agencia; }
    public String getConta() { return conta; }
    public String getMetodoPagamentoPreferencial() { return metodoPagamentoPreferencial; }
}