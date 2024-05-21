package up.Cenario3.src.controller;
import java.util.Scanner;

import up.Cenario3.src.model.Compromisso;

public class InserirCompromisso {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe os detalhes do compromisso:");
        System.out.print("Pessoa: ");
        String pessoa = scanner.nextLine();

        System.out.print("Local: ");
        String local = scanner.nextLine();

        System.out.print("Assunto: ");
        String assunto = scanner.nextLine();

        System.out.print("Hora: ");
        int hora = scanner.nextInt();

        Compromisso compromisso = new Compromisso(pessoa, local, assunto, hora);

        System.out.println("\nCompromisso criado com sucesso:");
        System.out.println("Pessoa: " + compromisso.getPessoa());
        System.out.println("Local: " + compromisso.getLocal());
        System.out.println("Assunto: " + compromisso.getAssunto());
        System.out.println("Hora: " + compromisso.getHora());

        scanner.close();
    }
}
