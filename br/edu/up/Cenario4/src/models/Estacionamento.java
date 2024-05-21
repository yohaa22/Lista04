package models;


import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Estacionamento {
    private int lugaresDisponiveis;
    private List<Carro> carrosEstacionados;
    int valor = 5;

    public Estacionamento(int totalLugares) {
        lugaresDisponiveis = totalLugares; // Atribuição direta sem subtração
        carrosEstacionados = new ArrayList<>();
  
    }


        public void adicionarCarro(Carro carro) {
            if (lugaresDisponiveis > 0) {
                carrosEstacionados.add(carro);
                lugaresDisponiveis--;
                System.out.println("Carro estacionado com sucesso.");
                valor += 5; // Incrementa o valor toda vez que um carro é estacionado
            } else {
                System.out.println("Estacionamento lotado.");
            }
        }
        


    public void removerCarro(String placa) {
        Iterator<Carro> iterator = carrosEstacionados.iterator();
        boolean carroRemovido = false;
        while (iterator.hasNext()) {
            Carro carro = iterator.next();
            if (carro.getPlaca().equals(placa)) {
                iterator.remove();
                lugaresDisponiveis++;
                carroRemovido = true;
                System.out.println("Carro removido com sucesso.");
                System.out.println("foi pego" + (valor ));
                break;
            }
        }
        if (!carroRemovido) {
            System.out.println("Carro não encontrado no estacionamento.");
        }
    }
    


   
    public void gerarRelatorio() {
        int carrosEntraram = carrosEstacionados.size();
        int carrosSairam = carrosEntraram - lugaresDisponiveis;
    
        if (carrosSairam < 0) {
            carrosSairam = 0;
        }
    
        // double pagamento = carrosSairam * 5.0; // Valor arrecadado apenas com carros que saíram
    
        System.out.println("Relatório:");
        System.out.println("Carros que entraram: " + carrosEntraram);
        System.out.println("Carros que saíram: " + carrosSairam);
        System.out.println("Valor arrecadado: R$" + valor );
    }
}