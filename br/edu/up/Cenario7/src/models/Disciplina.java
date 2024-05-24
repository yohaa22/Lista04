
import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    protected String nome;
    protected String identificador;
    protected String curriculo;
    protected List<Competencia> competencias;
    protected Professor professor;
    protected List<Aluno> alunos;

    public Disciplina(String nome, String identificador, String curriculo, Professor professor) {
        this.nome = nome;
        this.identificador = identificador;
        this.curriculo = curriculo;
        this.professor = professor;
        this.competencias = new ArrayList<>();
        this.alunos = new ArrayList<>();
    }

    // Getters and setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getIdentificador() { return identificador; }
    public void setIdentificador(String identificador) { this.identificador = identificador; }

    public String getCurriculo() { return curriculo; }
    public void setCurriculo(String curriculo) { this.curriculo = curriculo; }

    public List<Competencia> getCompetencias() { return competencias; }
    public void setCompetencias(List<Competencia> competencias) { this.competencias = competencias; }

    public Professor getProfessor() { return professor; }
    public void setProfessor(Professor professor) { this.professor = professor; }

    public List<Aluno> getAlunos() { return alunos; }
    public void setAlunos(List<Aluno> alunos) { this.alunos = alunos; }
}
