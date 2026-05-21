package br.edu.refactoring.estacionamento;

public class DadosSeguro {

    private String seguradora;
    private String numeroApolice;
    private String telefoneAssistencia;

    public DadosSeguro(String seguradora, String numeroApolice, String telefoneAssistencia) {
        this.seguradora = seguradora;
        this.numeroApolice = numeroApolice;
        this.telefoneAssistencia = telefoneAssistencia;
    }

    public String getFormatado() {
        return seguradora + " | Apólice " + numeroApolice + " | Assistência " + telefoneAssistencia;
    }

    public String getSeguradora() { return seguradora; }
    public String getNumeroApolice() { return numeroApolice; }
    public String getTelefoneAssistencia() { return telefoneAssistencia; }
}