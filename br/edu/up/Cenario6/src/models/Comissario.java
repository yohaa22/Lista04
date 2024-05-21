package models;
import java.util.List;


public class Comissario extends Tripulacao {
    protected List<String> idiomasFluencia;

    public List<String> getIdiomasFluencia() {
        return idiomasFluencia;
    }

    public void setIdiomasFluencia(List<String> idiomasFluencia) {
        this.idiomasFluencia = idiomasFluencia;
    }
}