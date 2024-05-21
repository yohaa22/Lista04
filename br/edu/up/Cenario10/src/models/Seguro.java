package models;

public abstract class Seguro {
    protected String numeroApolice;
    protected String titular;
    protected double valorPremio;

    public Seguro(String numeroApolice, String titular, double valorPremio) {
        this.numeroApolice = numeroApolice;
        this.titular = titular;
        this.valorPremio = valorPremio;
    }

    public String getNumeroApolice() {
        return numeroApolice;
    }

    public void setNumeroApolice(String numeroApolice) {
        this.numeroApolice = numeroApolice;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getValorPremio() {
        return valorPremio;
    }

    public void setValorPremio(double valorPremio) {
        this.valorPremio = valorPremio;
    }

    @Override
    public String toString() {
        return "Número da Apólice: " + numeroApolice + ", Titular: " + titular + ", Valor do Prêmio: " + valorPremio;
    }
}
