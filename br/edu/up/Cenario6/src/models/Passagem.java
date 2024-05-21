package models;
import javax.xml.crypto.Data;

public class Passagem {
    protected int numeroAssento;
    protected String classeAssento;
    protected Data dataVoo;

    public int getNumeroAssento() {
        return numeroAssento;
    }

    public void setNumeroAssento(int numeroAssento) {
        this.numeroAssento = numeroAssento;
    }

    public String getClasseAssento() {
        return classeAssento;
    }

    public void setClasseAssento(String classeAssento) {
        this.classeAssento = classeAssento;
    }

    public Data getDataVoo() {
        return dataVoo;
    }

    public void setDataVoo(Data dataVoo) {
        this.dataVoo = dataVoo;
    }
}
