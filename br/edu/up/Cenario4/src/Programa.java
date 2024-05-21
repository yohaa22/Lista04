import models.*;

import java.util.Scanner;


public class Programa {
    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento(10); // Inicializa o estacionamento com 10 vagas

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== Menu =====");
            System.out.println("1. Entrada de veículo");    
            System.out.println("2. Saída de veículo");
            System.out.println("3. Emitir relatório");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe a placa do veículo: ");
                    String placaEntrada = scanner.next();
                    System.out.print("Informe a cor do veículo: ");
                    String corEntrada = scanner.next();
                    System.out.print("Informe o modelo do veículo: ");
                    String modeloEntrada = scanner.next();
                    Carro novoCarro = new Carro(placaEntrada, corEntrada, modeloEntrada);
                    estacionamento.adicionarCarro(novoCarro);
                    break;
                case 2:
                    System.out.print("Informe a placa do veículo que deseja retirar: ");
                    String placaSaida = scanner.next();
                    estacionamento.removerCarro(placaSaida);
                    break;
                case 3:
                    estacionamento.gerarRelatorio();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
