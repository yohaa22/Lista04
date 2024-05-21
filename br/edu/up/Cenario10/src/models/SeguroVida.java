package models;

public class SeguroVida extends Seguro {
    protected double coberturaMorte;

    public SeguroVida(String numeroApolice, String titular, double valorPremio, double coberturaMorte) {
        super(numeroApolice, titular, valorPremio);
        this.coberturaMorte = coberturaMorte;
    }

    public double getCoberturaMorte() {
        return coberturaMorte;
    }

    public void setCoberturaMorte(double coberturaMorte) {
        this.coberturaMorte = coberturaMorte;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cobertura de Morte: " + coberturaMorte;
    }
}
