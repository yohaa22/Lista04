package controls;

import models.Seguro;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeguroController {
    private List<Seguro> seguros;
    private Scanner scanner;

    public SeguroController() {
        this.seguros = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public boolean adicionarSeguro(Seguro seguro) {
        if (localizarSeguro(seguro.getNumeroApolice()) != null) {
            System.out.println("Número de apólice já existe!");
            return false;
        }
        seguros.add(seguro);
        return true;
    }

    public Seguro localizarSeguro(String numeroApolice) {
        for (Seguro seguro : seguros) {
            if (seguro.getNumeroApolice().equals(numeroApolice)) {
                return seguro;
            }
        }
        return null;
    }

    public boolean excluirSeguro(String numeroApolice) {
        Seguro seguro = localizarSeguro(numeroApolice);
        if (seguro != null) {
            seguros.remove(seguro);
            return true;
        }
        return false;
    }

    public void excluirTodosSeguros() {
        System.out.print("Tem certeza que deseja excluir todos os seguros? (s/n): ");
        String confirmacao = scanner.nextLine();
        if (confirmacao.equalsIgnoreCase("s")) {
            seguros.clear();
            System.out.println("Todos os seguros foram excluídos.");
        }
    }

    public int quantidadeSeguros() {
        return seguros.size();
    }

    public List<Seguro> listarTodosSeguros() {
        return seguros;
    }
}
