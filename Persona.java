public class Persona {
    private Mano mano;

    public Persona (Mano mano){
        this.mano=mano;
    }

    public void addCard(Carta card){
        this.mano.añadirCarta(card);
    }

    public void cleanHand(){
        this.mano.limpiarMano();
    }

    public void getPoints(){
        this.mano.calcularPuntos();
    }
    
     public void showCards(){
        this.mano.mostrarMano();
    }
    
}
