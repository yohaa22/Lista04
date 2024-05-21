package view;
import java.util.Scanner;
import controls.TrafegoController;

public class MenuView {
    protected TrafegoController controller;
    protected Scanner scanner;

    public MenuView() {
        this.controller = new TrafegoController();
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("=== Menu ===");
            System.out.println("1. Registrar Passageiro");
            System.out.println("2. Registrar Tripulante");
            System.out.println("3. Atualizar Informações da Aeronave");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    registrarPassageiro();
                    break;
                case 2:
                    registrarTripulante();
                    break;
                case 3:
                    atualizarInformacoesAeronave();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
                    break;
            }
        } while (opcao != 0);
        
        scanner.close();
    }

    protected void registrarPassageiro() {
        System.out.println("=== Registrar Passageiro ===");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("RG: ");
        String rg = scanner.nextLine();
        System.out.print("Identificador de Bagagem: ");
        String identificadorBagagem = scanner.nextLine();
        controller.registrarPassageiro(nome, rg, identificadorBagagem);
        System.out.println("Passageiro registrado com sucesso!");
    }

    protected void registrarTripulante() {
        System.out.println("=== Registrar Tripulante ===");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("RG: ");
        String rg = scanner.nextLine();
        System.out.print("Identificação Aeronáutica: ");
        String identificacaoAeronautica = scanner.nextLine();
        controller.registrarTripulante(nome, rg, identificacaoAeronautica);
        System.out.println("Tripulante registrado com sucesso!");
    }

    protected void atualizarInformacoesAeronave() {
        System.out.println("=== Atualizar Informações da Aeronave ===");
        System.out.print("Código: ");
        String codigo = scanner.nextLine();
        System.out.print("Tipo: ");
        String tipo = scanner.nextLine();
        System.out.print("Quantidade de Assentos: ");
        int quantidadeAssentos = scanner.nextInt();
        scanner.nextLine();
        controller.atualizarInformacoesAeronave(codigo, tipo, quantidadeAssentos);
        System.out.println("Informações da aeronave atualizadas com sucesso!");
    }
}