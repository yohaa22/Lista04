




public class Programa {
    public static void main(String[] args) {

        Ponto ponto1 = new Ponto();


        Ponto ponto2 = new Ponto(2, 5);


        double distanciaPonto1Ponto2 = ponto1.calcularDistancia(ponto2);
        System.out.println("Distância entre ponto1 e ponto2: " + distanciaPonto1Ponto2);

   
        Ponto pontoDestino = new Ponto(7, 2);
        double distanciaPonto2Destino = ponto2.calcularDistancia(pontoDestino);
        System.out.println("Distância entre ponto2 e destino: " + distanciaPonto2Destino);

        ponto1.setX(10);

 
        ponto1.setY(3);
    }
}
