package up.Cenario3.src.model;

public class Compromisso {
    private String pessoa;
    private String local;
    private String assunto;
    private int hora;

    public Compromisso(String pessoa, String local, String assunto, int hora){
        this.pessoa = pessoa;
        this.local = local;
        this.assunto = assunto;
        this.hora = hora;
    }

    public String getPessoa(){
        return pessoa;
    }

    public String getLocal(){
        return local;
    }

    public String getAssunto(){
        return assunto;
    }

    public int getHora(){
        return hora;
    }
}
