package controls;

import models.Passageiro;
import models.Tripulacao;
import models.Aeronave;

public class TrafegoController {
    
    public void registrarPassageiro(String nome, String rg, String identificadorBagagem) {
       
        Passageiro passageiro = new Passageiro();
        passageiro.setNome(nome);
        passageiro.setRg(rg);
        passageiro.setIdentificadorBagagem(identificadorBagagem);
        

    }

    public void registrarTripulante(String nome, String rg, String identificacaoAeronautica) {
        
        Tripulacao tripulante = new Tripulacao();
        tripulante.setNome(nome);
        tripulante.setRg(rg);
        tripulante.setIdentificacaoAeronautica(identificacaoAeronautica);
        
        
    }

    public void atualizarInformacoesAeronave(String codigo, String tipo, int quantidadeAssentos) {
        
        Aeronave aeronave = new Aeronave();
        aeronave.setCodigo(codigo);
        aeronave.setTipo(tipo);
        aeronave.setQuantidadeAssentos(quantidadeAssentos);
        
        
    }
}
