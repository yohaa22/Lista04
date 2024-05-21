package models;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    protected List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void adicionarContatoComercial(int codigo, String nome, String telefone, String empresa) {
        Comercial contato = new Comercial(codigo, nome, telefone, empresa);
        adicionarContato(contato);
    }

    public void adicionarContatoPessoal(int codigo, String nome, String telefone, String aniversario) {
        Pessoal contato = new Pessoal(codigo, nome, telefone, aniversario);
        adicionarContato(contato);
    }

    public void removerContato(int codigo) {
        contatos.removeIf(contato -> contato.getCodigo() == codigo);
    }

    public Contato consultarContato(int codigo) {
        for (Contato contato : contatos) {
            if (contato.getCodigo() == codigo) {
                return contato;
            }
        }
        return null;
    }

    public List<Contato> listarContatos() {
        return contatos;
    }
}
