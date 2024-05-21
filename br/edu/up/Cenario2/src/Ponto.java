
public class Ponto {
    protected double x;
    protected double y;

    public Ponto(){

        this.x = 0;
        this.y = 0;
    }
    
    public Ponto(double x, double y){

        this.x = x;
        this.y = y;
    }
    

// teorema de pitagoras
public double calcularDistancia(Ponto outroPonto) {
    double diferencaX = this.x - outroPonto.getX();
    double diferencaY = this.y - outroPonto.getY();
    double distancia = Math.sqrt(Math.pow(diferencaX, 2) + Math.pow(diferencaY, 2));
    return distancia;
}


public void setX(double x) {
    this.x = x;
}


public void setY(double y) {
    this.y = y;
}

public double getX() {
    return x;
}


public double getY() {
    return y;
}
}
