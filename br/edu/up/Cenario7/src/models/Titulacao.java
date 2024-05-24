

public class Titulacao {
    protected String instituicao;
    protected int anoConclusao;
    protected String nomeTitulo;
    protected String tituloTrabalho;

    public Titulacao(String instituicao, int anoConclusao, String nomeTitulo, String tituloTrabalho) {
        this.instituicao = instituicao;
        this.anoConclusao = anoConclusao;
        this.nomeTitulo = nomeTitulo;
        this.tituloTrabalho = tituloTrabalho;
    }

    // Getters and setters
    public String getInstituicao() { return instituicao; }
    public void setInstituicao(String instituicao) { this.instituicao = instituicao; }

    public int getAnoConclusao() { return anoConclusao; }
    public void setAnoConclusao(int anoConclusao) { this.anoConclusao = anoConclusao; }

    public String getNomeTitulo() { return nomeTitulo; }
    public void setNomeTitulo(String nomeTitulo) { this.nomeTitulo = nomeTitulo; }

    public String getTituloTrabalho() { return tituloTrabalho; }
    public void setTituloTrabalho(String tituloTrabalho) { this.tituloTrabalho = tituloTrabalho; }
}
