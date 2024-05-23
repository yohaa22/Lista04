package up.Cenario5.src.models;

import java.time.LocalDate;

public class Evento {
    private String nome;
    private LocalDate data;
    private String local;

    // Getters e setters...
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}
