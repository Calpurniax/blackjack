public class Persona {
    private Mano mano;

    public Persona (Mano mano){
        this.mano=mano;
    }
    /*Método para añadir carta a la mano a través del método suyo*/
    public void addCard(Carta card){
        this.mano.añadirCarta(card);
    }
    /*Método para limpiar la mano a través del método suyo*/
    public void cleanHand(){
        this.mano.limpiarMano();
    }
    /*Método para calcular los puntos de la mano a través del método suyo*/
    public void getPoints(){
        this.mano.calcularPuntos();
    }
    /*Método para enseñar las cartas de la mano a través del método suyo*/
     public void showCards(){
        this.mano.mostrarMano();
    }
    
}
