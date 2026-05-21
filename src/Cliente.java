package br.edu.refactoring.estacionamento;

public class Cliente {

    private String nome;
    private String cpf;
    private String telefone;
    private int pontosFidelidade;
    private int mesesComoCliente;
    private boolean mensalista;

    private DadosCobranca dadosCobranca;

    public Cliente(String nome, String cpf, String telefone,
                   int pontosFidelidade, int mesesComoCliente, boolean mensalista,
                   String banco, String agencia, String conta, String metodoPagamentoPreferencial) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.pontosFidelidade = pontosFidelidade;
        this.mesesComoCliente = mesesComoCliente;
        this.mensalista = mensalista;
        this.dadosCobranca = new DadosCobranca(banco, agencia, conta, metodoPagamentoPreferencial);
    }

    public int calcularDesconto() {
        if (mensalista && pontosFidelidade >= 4000) return 20;
        if (mesesComoCliente >= 12 && pontosFidelidade >= 2000) return 10;
        if (pontosFidelidade >= 1000) return 5;
        return 0;
    }

    public void imprimirResumo() {
        System.out.println("Cliente: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);
        System.out.println("Pontos de fidelidade: " + pontosFidelidade);
        System.out.println("Mensalista: " + mensalista);
        System.out.println("Cobrança: " + dadosCobranca.getFormatado());
    }

    public String getDadosCobrancaFormatados() { return dadosCobranca.getFormatado(); }
    public DadosCobranca getDadosCobranca() { return dadosCobranca; }
    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getTelefone() { return telefone; }
    public int getPontosFidelidade() { return pontosFidelidade; }
    public int getMesesComoCliente() { return mesesComoCliente; }
    public boolean isMensalista() { return mensalista; }
}