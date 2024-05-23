package up.Cenario5.src.controls;

import up.Cenario5.src.models.Evento;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

public class ControladorEvento {
    private List<Evento> eventos = new ArrayList<>();

    public void adicionarEvento(Evento evento) {
        eventos.add(evento);
        System.out.println("Evento adicionado: " + evento.getNome());
    }

    public void alterarEvento(String nome, LocalDate novaData, String novoLocal) {
        for (Evento evento : eventos) {
            if (evento.getNome().equals(nome)) {
                evento.setData(novaData);
                evento.setLocal(novoLocal);
                System.out.println("Evento alterado: " + evento.getNome());
                return;
            }
        }
        System.out.println("Evento não encontrado: " + nome);
    }

    public void listarEventos() {
        if (eventos.isEmpty()) {
            System.out.println("Nenhum evento encontrado.");
        } else {
            for (Evento evento : eventos) {
                System.out.println("Evento: " + evento.getNome() + ", Data: " + evento.getData() + ", Local: " + evento.getLocal());
            }
        }
    }

    public void excluirEvento(String nome) {
        for (Evento evento : eventos) {
            if (evento.getNome().equals(nome)) {
                eventos.remove(evento);
                System.out.println("Evento excluído: " + nome);
                return;
            }
        }
        System.out.println("Evento não encontrado: " + nome);
    }
}
