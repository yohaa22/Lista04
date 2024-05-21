package view;

import models.Comercial;
import models.Pessoal;

import java.util.List;
import java.util.Scanner;

public class ContatoView {
    private Scanner scanner;

    public ContatoView() {
        scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("Menu:");
        System.out.println("1. Incluir um contato pessoal");
        System.out.println("2. Incluir um contato comercial");
        System.out.println("3. Excluir um contato pelo código");
        System.out.println("4. Consultar um contato pelo código");
        System.out.println("5. Listar todos os contatos");
        System.out.println("6. Sair do programa");
        return scanner.nextInt();
    }

    public Pessoal lerDadosContatoPessoal() {
        System.out.println("Digite o código:");
        int codigo = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Digite o nome:");
        String nome = scanner.nextLine();
        System.out.println("Digite o telefone:");
        String telefone = scanner.nextLine();
        System.out.println("Digite o aniversário:");
        String aniversario = scanner.nextLine();
        return new Pessoal(codigo, nome, telefone, aniversario);
    }

    public Comercial lerDadosContatoComercial() {
        System.out.println("Digite o código:");
        int codigo = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Digite o nome:");
        String nome = scanner.nextLine();
        System.out.println("Digite o telefone:");
        String telefone = scanner.nextLine();
        System.out.println("Digite a empresa:");
        String empresa = scanner.nextLine();
        return new Comercial(codigo, nome, telefone, empresa);
    }

    public int lerCodigoContato() {
        System.out.println("Digite o código do contato:");
        return scanner.nextInt();
    }

    public void mostrarContato(models.Contato contato) {
        if (contato != null) {
            System.out.println(contato);
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    public void mostrarContatos(List<models.Contato> contatos) {
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato encontrado.");
        } else {
            for (models.Contato contato : contatos) {
                System.out.println(contato);
            }
        }
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
