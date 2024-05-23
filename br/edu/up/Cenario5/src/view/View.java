package up.Cenario5.src.view;

import up.Cenario5.src.controls.ControladorEvento;
import up.Cenario5.src.controls.ControladorReserva;
import up.Cenario5.src.models.Evento;
import up.Cenario5.src.models.Reserva;




import java.time.LocalDate;
import java.util.Scanner;

public class View {
    private ControladorEvento controladorEvento;
    private ControladorReserva controladorReserva;
    private Scanner scanner;

    public View(ControladorEvento controladorEvento, ControladorReserva controladorReserva) {
        this.controladorEvento = controladorEvento;
        this.controladorReserva = controladorReserva;
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar Evento");
            System.out.println("2. Alterar Evento");
            System.out.println("3. Listar Eventos");
            System.out.println("4. Excluir Evento");
            System.out.println("5. Adicionar Reserva");
            System.out.println("6. Alterar Reserva");
            System.out.println("7. Listar Reservas");
            System.out.println("8. Excluir Reserva");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    adicionarEvento();
                    break;
                case 2:
                    alterarEvento();
                    break;
                case 3:
                    listarEventos();
                    break;
                case 4:
                    excluirEvento();
                    break;
                case 5:
                    adicionarReserva();
                    break;
                case 6:
                    alterarReserva();
                    break;
                case 7:
                    listarReservas();
                    break;
                case 8:
                    excluirReserva();
                    break;
                case 0:
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }

    private void adicionarEvento() {
        System.out.print("Nome do evento: ");
        String nome = scanner.nextLine();
        System.out.print("Data do evento (aaaa-mm-dd): ");
        LocalDate data = LocalDate.parse(scanner.nextLine());
        System.out.print("Local do evento: ");
        String local = scanner.nextLine();

        Evento evento = new Evento();
        evento.setNome(nome);
        evento.setData(data);
        evento.setLocal(local);
        controladorEvento.adicionarEvento(evento);
    }

    private void alterarEvento() {
        System.out.print("Nome do evento a alterar: ");
        String nome = scanner.nextLine();
        System.out.print("Nova data do evento (aaaa-mm-dd): ");
        LocalDate novaData = LocalDate.parse(scanner.nextLine());
        System.out.print("Novo local do evento: ");
        String novoLocal = scanner.nextLine();

        controladorEvento.alterarEvento(nome, novaData, novoLocal);
    }

    private void listarEventos() {
        controladorEvento.listarEventos();
    }

    private void excluirEvento() {
        System.out.print("Nome do evento a excluir: ");
        String nome = scanner.nextLine();
        controladorEvento.excluirEvento(nome);
    }

    private void adicionarReserva() {
        System.out.print("Responsável pela reserva: ");
        String responsavel = scanner.nextLine();
        System.out.print("Quantidade de pessoas: ");
        int quantidadePessoas = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha
        System.out.print("Data da reserva (aaaa-mm-dd): ");
        LocalDate data = LocalDate.parse(scanner.nextLine());
        System.out.print("Valor total: ");
        double valorTotal = scanner.nextDouble();
        scanner.nextLine(); // Consumir a nova linha

        Reserva reserva = new Reserva();
        reserva.setResponsavel(responsavel);
        reserva.setQuantidadePessoas(quantidadePessoas);
        reserva.setData(data);
        reserva.setValorTotal(valorTotal);
        controladorReserva.adicionarReserva(reserva);
    }

    private void alterarReserva() {
        System.out.print("Responsável pela reserva a alterar: ");
        String responsavel = scanner.nextLine();
        System.out.print("Nova data da reserva (aaaa-mm-dd): ");
        LocalDate novaData = LocalDate.parse(scanner.nextLine());
        System.out.print("Nova quantidade de pessoas: ");
        int novaQuantidadePessoas = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha
        System.out.print("Novo valor total: ");
        double novoValorTotal = scanner.nextDouble();
        scanner.nextLine(); // Consumir a nova linha

        controladorReserva.alterarReserva(responsavel, novaData, novaQuantidadePessoas, novoValorTotal);
    }

    private void listarReservas() {
        controladorReserva.listarReservas();
    }

    private void excluirReserva() {
        System.out.print("Responsável pela reserva a excluir: ");
        String responsavel = scanner.nextLine();
        controladorReserva.excluirReserva(responsavel);
    }
}
