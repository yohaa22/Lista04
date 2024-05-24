

public class Programa {
    public static void main(String[] args) {
        AlunoController alunoController = new AlunoController();
        AlunoView alunoView = new AlunoView(alunoController);

        alunoView.menu();
    }
}
