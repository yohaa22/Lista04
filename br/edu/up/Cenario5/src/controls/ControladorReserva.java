package up.Cenario5.src.controls;

import up.Cenario5.src.models.Reserva;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

public class ControladorReserva {
    private List<Reserva> reservas = new ArrayList<>();

    public void adicionarReserva(Reserva reserva) {
        reservas.add(reserva);
        System.out.println("Reserva adicionada: " + reserva.getResponsavel());
    }

    public void alterarReserva(String responsavel, LocalDate novaData, int novaQuantidadePessoas, double novoValorTotal) {
        for (Reserva reserva : reservas) {
            if (reserva.getResponsavel().equals(responsavel)) {
                reserva.setData(novaData);
                reserva.setQuantidadePessoas(novaQuantidadePessoas);
                reserva.setValorTotal(novoValorTotal);
                System.out.println("Reserva alterada: " + reserva.getResponsavel());
                return;
            }
        }
        System.out.println("Reserva não encontrada: " + responsavel);
    }

    public void listarReservas() {
        if (reservas.isEmpty()) {
            System.out.println("Nenhuma reserva encontrada.");
        } else {
            for (Reserva reserva : reservas) {
                System.out.println("Reserva: Responsável: " + reserva.getResponsavel() + ", Data: " + reserva.getData() + ", Quantidade de Pessoas: " + reserva.getQuantidadePessoas() + ", Valor Total: " + reserva.getValorTotal());
            }
        }
    }

    public void excluirReserva(String responsavel) {
        for (Reserva reserva : reservas) {
            if (reserva.getResponsavel().equals(responsavel)) {
                reservas.remove(reserva);
                System.out.println("Reserva excluída: " + responsavel);
                return;
            }
        }
        System.out.println("Reserva não encontrada: " + responsavel);
    }
}
