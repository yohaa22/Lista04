

public class Competencia {
    private String descricao;
    private String tipo;

    public Competencia(String descricao, String tipo) {
        this.descricao = descricao;
        this.tipo = tipo;
    }

    // Getters and setters
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
}
