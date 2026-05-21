package br.edu.refactoring.estacionamento;

public class Veiculo {

    private String placa;
    private String modelo;
    private String cor;

    private DadosSeguro dadosSeguro;

    public Veiculo(String placa, String modelo, String cor,
                   String seguradora, String numeroApolice, String telefoneAssistencia) {
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
        this.dadosSeguro = new DadosSeguro(seguradora, numeroApolice, telefoneAssistencia);
    }

    public void imprimirDados() {
        System.out.println("Veículo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Cor: " + cor);
        System.out.println("Seguro: " + dadosSeguro.getFormatado());
    }

    public String getDadosSeguroFormatados() { return dadosSeguro.getFormatado(); }
    public DadosSeguro getDadosSeguro() { return dadosSeguro; }
    public String getPlaca() { return placa; }
    public String getModelo() { return modelo; }
    public String getCor() { return cor; }
    public String getSeguradora() { return dadosSeguro.getSeguradora(); }
    public String getNumeroApolice() { return dadosSeguro.getNumeroApolice(); }
    public String getTelefoneAssistencia() { return dadosSeguro.getTelefoneAssistencia(); }
}