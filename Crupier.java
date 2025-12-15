public class Crupier extends Persona{
    Baraja baraja;

    public Crupier (Baraja baraja){
        this.baraja=baraja;
    }

   public Carta repartir(int position){
       return this.baraja.getCard(position);
   }
    
}
