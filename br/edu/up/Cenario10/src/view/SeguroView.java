package view;

import controls.SeguroController;
import models.Seguro;
import models.SeguroVida;
import models.SeguroVeiculo;
import java.util.Scanner;

public class SeguroView {
    private SeguroController controller;
    private Scanner scanner;

    public SeguroView(SeguroController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        String menu = "1. Incluir seguro\n" +
                      "2. Localizar seguro\n" +
                      "3. Excluir seguro\n" +
                      "4. Excluir todos os seguros\n" +
                      "5. Listar todos os seguros\n" +
                      "6. Ver quantidade de seguros\n" +
                      "7. Sair\n";

        int opcao = 0;
        while (opcao != 7) {
            System.out.print(menu);
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    incluirSeguro();
                    break;
                case 2:
                    localizarSeguro();
                    break;
                case 3:
                    excluirSeguro();
                    break;
                case 4:
                    excluirTodosSeguros();
                    break;
                case 5:
                    listarTodosSeguros();
                    break;
                case 6:
                    verQuantidadeSeguros();
                    break;
                case 7:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private void incluirSeguro() {
        System.out.print("Digite o tipo de seguro (Vida/Veículo): ");
        String tipoSeguro = scanner.nextLine();
        System.out.print("Número da Apólice: ");
        String numeroApolice = scanner.nextLine();
        System.out.print("Titular: ");
        String titular = scanner.nextLine();
        System.out.print("Valor do Prêmio: ");
        double valorPremio = Double.parseDouble(scanner.nextLine());

        if (tipoSeguro.equalsIgnoreCase("vida")) {
            System.out.print("Cobertura de Morte: ");
            double coberturaMorte = Double.parseDouble(scanner.nextLine());
            SeguroVida seguroVida = new SeguroVida(numeroApolice, titular, valorPremio, coberturaMorte);
            controller.adicionarSeguro(seguroVida);
        } else if (tipoSeguro.equalsIgnoreCase("veiculo")) {
            System.out.print("Modelo do Veículo: ");
            String modeloVeiculo = scanner.nextLine();
            SeguroVeiculo seguroVeiculo = new SeguroVeiculo(numeroApolice, titular, valorPremio, modeloVeiculo);
            controller.adicionarSeguro(seguroVeiculo);
        }
    }

    private void localizarSeguro() {
        System.out.print("Digite o número da apólice: ");
        String numeroApolice = scanner.nextLine();
        Seguro seguro = controller.localizarSeguro(numeroApolice);
        if (seguro != null) {
            System.out.println(seguro);
        } else {
            System.out.println("Seguro não encontrado.");
        }
    }

    private void excluirSeguro() {
        System.out.print("Digite o número da apólice: ");
        String numeroApolice = scanner.nextLine();
        if (controller.excluirSeguro(numeroApolice)) {
            System.out.println("Seguro excluído com sucesso.");
        } else {
            System.out.println("Seguro não encontrado.");
        }
    }

    private void excluirTodosSeguros() {
        System.out.print("Tem certeza que deseja excluir todos os seguros? (s/n): ");
        String confirmacao = scanner.nextLine();
        if (confirmacao.equalsIgnoreCase("s")) {
            controller.excluirTodosSeguros();
            System.out.println("Todos os seguros foram excluídos.");
        }
    }

    private void listarTodosSeguros() {
        for (Seguro s : controller.listarTodosSeguros()) {
            System.out.println(s);
        }
    }

    private void verQuantidadeSeguros() {
        int quantidade = controller.quantidadeSeguros();
        System.out.println("Quantidade de seguros: " + quantidade);
    }
}
