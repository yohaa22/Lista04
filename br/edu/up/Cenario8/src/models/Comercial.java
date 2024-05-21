package models;

public class Comercial extends Contato {
    protected String empresa;

    public Comercial(int codigo, String nome, String telefone, String empresa) {
        super(codigo, nome, telefone);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    @Override
    public String getDetalhes() {
        return "Empresa: " + empresa;
    }
}
