package up.Cenario9.src.view;

import java.util.Scanner;
import up.Cenario9.src.controls.ClienteController;


public class ClienteView {
    protected ClienteController clienteController;

    public ClienteView(ClienteController clienteController) {
        this.clienteController = clienteController;
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Incluir cliente pessoa");
            System.out.println("2. Incluir cliente empresa");
            System.out.println("3. Mostrar dados cliente pessoa");
            System.out.println("4. Mostrar dados cliente empresa");
            System.out.println("5. Emprestar para cliente pessoa");
            System.out.println("6. Emprestar para cliente empresa");
            System.out.println("7. Devolução de cliente pessoa");
            System.out.println("8. Devolução de cliente empresa");
            System.out.println("9. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarClientePessoa();
                    break;
                case 2:
                    cadastrarClienteEmpresa();
                    break;
                case 3:
                    mostrarDadosClientePessoa();
                    break;
                case 4:
                    mostrarDadosClienteEmpresa();
                    break;
                case 5:
                    emprestarClientePessoa();
                    break;
                case 6:
                    emprestarClienteEmpresa();
                    break;
                case 7:
                    devolverClientePessoa();
                    break;
                case 8:
                    devolverClienteEmpresa();
                    break;
                case 9:
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    private void cadastrarClientePessoa() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        clienteController.cadastrarClientePessoa(nome, cpf);
        System.out.println("Cliente pessoa cadastrado com sucesso!");
    }

    private void cadastrarClienteEmpresa() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CNPJ: ");
        String cnpj = scanner.nextLine();
        clienteController.cadastrarClienteEmpresa(nome, cnpj);
        System.out.println("Cliente empresa cadastrado com sucesso!");
    }

    private void mostrarDadosClientePessoa() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("CPF do cliente pessoa: ");
        String cpf = scanner.nextLine();
        System.out.println(clienteController.buscarClientePessoa(cpf));
    }

    private void mostrarDadosClienteEmpresa() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("CNPJ do cliente empresa: ");
        String cnpj = scanner.nextLine();
        System.out.println(clienteController.buscarClienteEmpresa(cnpj));
    }

    private void emprestarClientePessoa() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("CPF do cliente pessoa: ");
        String cpf = scanner.nextLine();
        System.out.print("Valor para empréstimo: ");
        double valor = scanner.nextDouble();
        clienteController.emprestarClientePessoa(cpf, valor);
    }

    private void emprestarClienteEmpresa() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("CNPJ do cliente empresa: ");
        String cnpj = scanner.nextLine();
        System.out.print("Valor para empréstimo: ");
        double valor = scanner.nextDouble();
        clienteController.emprestarClienteEmpresa(cnpj, valor);
    }

    private void devolverClientePessoa() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("CPF do cliente pessoa: ");
        String cpf = scanner.nextLine();
        System.out.print("Valor para devolução: ");
        double valor = scanner.nextDouble();
        clienteController.devolverClientePessoa(cpf, valor);
    }

    private void devolverClienteEmpresa() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("CNPJ do cliente empresa: ");
        String cnpj = scanner.nextLine();
        System.out.print("Valor para devolução: ");
        double valor = scanner.nextDouble();
        clienteController.devolverClienteEmpresa(cnpj, valor);
    }
    
}
