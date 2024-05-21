package up.Cenario3.src.model;

public class Mes {
    private String nome;
    private int qtdeDias;
    private Dia[] dias;

    public Mes(String nome, int qtdeDias) {
        this.nome = nome;
        this.qtdeDias = qtdeDias;
        this.dias = new Dia[qtdeDias];
        for (int i = 0; i < qtdeDias; i++) {
            dias[i] = new Dia(i + 1);
        }
    }

    public void adicionarCompromisso(Compromisso comp, int diaMes) {
        if (diaMes >= 1 && diaMes <= qtdeDias) {
            dias[diaMes - 1].adicionarCompromisso(comp);
        } else {
            System.out.println("Dia inválido.");
        }
    }

    public void excluirCompromisso(int diaMes, int hora) {
        if (diaMes >= 1 && diaMes <= qtdeDias) {
            dias[diaMes - 1].excluirCompromisso(hora);
        } else {
            System.out.println("Dia inválido.");
        }
    }

    public String listarCompromissos(int diaMes) {
        if (diaMes >= 1 && diaMes <= qtdeDias) {
            return dias[diaMes - 1].listarCompromissos();
        } else {
            return "Dia inválido.";
        }
    }
}
