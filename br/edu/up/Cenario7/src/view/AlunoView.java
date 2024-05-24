
import java.util.Scanner;

public class AlunoView {
    private AlunoController alunoController;

    public AlunoView(AlunoController alunoController) {
        this.alunoController = alunoController;
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Listar Alunos");
            System.out.println("3. Verificar Situação do Aluno");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    cadastrarAluno(scanner);
                    break;
                case "2":
                    listarAlunos();
                    break;
                case "3":
                    verificarSituacaoAluno(scanner);
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    private void cadastrarAluno(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("RG: ");
        String rg = scanner.nextLine();
        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();
        System.out.print("Ano de Ingresso: ");
        int anoIngresso = Integer.parseInt(scanner.nextLine());
        System.out.print("Curso: ");
        String curso = scanner.nextLine();
        System.out.print("Turno: ");
        String turno = scanner.nextLine();

        alunoController.cadastrarAluno(nome, rg, matricula, anoIngresso, curso, turno);
        System.out.println("Aluno cadastrado com sucesso!");
    }

    private void listarAlunos() {
        alunoController.listarAlunos();
    }

    private void verificarSituacaoAluno(Scanner scanner) {
        System.out.print("Digite a matrícula do aluno: ");
        String matricula = scanner.nextLine();
        String situacao = alunoController.verificarSituacaoAluno(matricula);
        System.out.println("Situação do aluno: " + situacao);
    }
}
