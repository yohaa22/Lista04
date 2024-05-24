import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class AlunoController {
    private List<Aluno> alunos;

    public AlunoController() {
        alunos = new ArrayList<>();
    }

    public void cadastrarAluno(String nome, String rg, String matricula, int anoIngresso, String curso, String turno) {
        Aluno aluno = new Aluno(nome, rg, matricula, anoIngresso, curso, turno);
        alunos.add(aluno);
    }

    public void listarAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome() + ", Matrícula: " + aluno.getMatricula() +
                    ", Curso: " + aluno.getCurso() + ", Turno: " + aluno.getTurno());
        }
    }

    public String verificarSituacaoAluno(String matricula) {
        Optional<Aluno> alunoOpt = alunos.stream().filter(a -> a.getMatricula().equals(matricula)).findFirst();
        if (alunoOpt.isPresent()) {
            return alunoOpt.get().verificarSituacao();
        } else {
            return "Aluno não encontrado";
        }
    }
}
