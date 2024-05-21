package controls;

import models.Agenda;
import view.ContatoView;
import models.Comercial;
import models.Pessoal;
import models.Contato;

public class ContatoController {
    protected Agenda agenda;
    protected ContatoView view;

    public ContatoController(Agenda agenda, ContatoView view) {
        this.agenda = agenda;
        this.view = view;
    }

    public void iniciar() {
        while (true) {
            int opcao = view.mostrarMenu();
            switch (opcao) {
                case 1:
                    Pessoal contatoPessoal = view.lerDadosContatoPessoal();
                    agenda.adicionarContato(contatoPessoal);
                    view.mostrarMensagem("Contato pessoal adicionado com sucesso.");
                    break;
                case 2:
                    Comercial contatoComercial = view.lerDadosContatoComercial();
                    agenda.adicionarContato(contatoComercial);
                    view.mostrarMensagem("Contato comercial adicionado com sucesso.");
                    break;
                case 3:
                    int codigoExcluir = view.lerCodigoContato();
                    agenda.removerContato(codigoExcluir);
                    view.mostrarMensagem("Contato excluído com sucesso.");
                    break;
                case 4:
                    int codigoConsultar = view.lerCodigoContato();
                    Contato contato = agenda.consultarContato(codigoConsultar);
                    view.mostrarContato(contato);
                    break;
                case 5:
                    view.mostrarContatos(agenda.listarContatos());
                    break;
                case 6:
                    view.mostrarMensagem("Saindo do programa.");
                    return;
                default:
                    view.mostrarMensagem("Opção inválida.");
            }
        }
    }
}
