

import java.util.HashMap;
import java.util.Map;

public class Aluno extends Pessoa {
    protected int anoIngresso;
    protected String curso;
    protected String turno;
    protected Map<Competencia, String> competencias;

    public Aluno(String nome, String rg, String matricula, int anoIngresso, String curso, String turno) {
        super(nome, rg, matricula);
        this.anoIngresso = anoIngresso;
        this.curso = curso;
        this.turno = turno;
        this.competencias = new HashMap<>();
    }

    public void adicionarCompetencia(Competencia competencia, String situacao) {
        competencias.put(competencia, situacao);
    }

    public String verificarSituacao() {
        long necessariasAtingidas = competencias.entrySet().stream()
            .filter(e -> e.getKey().getTipo().equals("Necessária") && e.getValue().equals("Atingida"))
            .count();

        long complementaresAtingidas = competencias.entrySet().stream()
            .filter(e -> e.getKey().getTipo().equals("Complementar") && e.getValue().equals("Atingida"))
            .count();

        long necessariasTotal = competencias.entrySet().stream()
            .filter(e -> e.getKey().getTipo().equals("Necessária"))
            .count();

        long complementaresTotal = competencias.entrySet().stream()
            .filter(e -> e.getKey().getTipo().equals("Complementar"))
            .count();

        if (necessariasTotal > 0 && necessariasAtingidas == necessariasTotal && 
            (complementaresTotal == 0 || complementaresAtingidas >= complementaresTotal / 2)) {
            return "Aprovado";
        } else if (necessariasTotal > 0 && (necessariasAtingidas < necessariasTotal / 2 || 
                   complementaresTotal > 0 && complementaresAtingidas < complementaresTotal / 2)) {
            return "Reprovado";
        } else {
            return "Pendente";
        }
    }

    // Getters and setters
    public int getAnoIngresso() { return anoIngresso; }
    public void setAnoIngresso(int anoIngresso) { this.anoIngresso = anoIngresso; }

    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }

    public String getTurno() { return turno; }
    public void setTurno(String turno) { this.turno = turno; }
}
