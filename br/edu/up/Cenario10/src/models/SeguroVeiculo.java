package models;

public class SeguroVeiculo extends Seguro {
    protected String modeloVeiculo;

    public SeguroVeiculo(String numeroApolice, String titular, double valorPremio, String modeloVeiculo) {
        super(numeroApolice, titular, valorPremio);
        this.modeloVeiculo = modeloVeiculo;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Modelo do Veículo: " + modeloVeiculo;
    }
}
