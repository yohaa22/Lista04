package up.Cenario3.src.model;

public class Dia {
    private int diaMes;
    private Compromisso[] compromissos;
    private int tamanho;

    public Dia(int diaMes) {
        this.diaMes = diaMes;
        this.compromissos = new Compromisso[24]; // Um compromisso para cada hora do dia
        this.tamanho = 0;
    }

    public void adicionarCompromisso(Compromisso comp) {
        if (tamanho < 24) {
            compromissos[tamanho++] = comp;
        } else {
            System.out.println("O dia já está cheio de compromissos.");
        }
    }

    public Compromisso consultarCompromisso(int hora) {
        for (Compromisso comp : compromissos) {
            if (comp != null && comp.getHora() == hora) {
                return comp;
            }
        }
        return null;
    }

    public void excluirCompromisso(int hora) {
        for (int i = 0; i < tamanho; i++) {
            if (compromissos[i].getHora() == hora) {
                for (int j = i; j < tamanho - 1; j++) {
                    compromissos[j] = compromissos[j + 1];
                }
                compromissos[--tamanho] = null;
                return;
            }
        }
        System.out.println("Compromisso não encontrado.");
    }

    public String listarCompromissos() {
        StringBuilder sb = new StringBuilder();
        for (Compromisso comp : compromissos) {
            if (comp != null) {
                sb.append(comp.toString()).append("\n");
            }
        }
        return sb.toString();
    }
}

