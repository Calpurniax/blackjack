public class Crupier extends Persona{
    Baraja baraja;

    public Crupier (Baraja baraja){
        this.baraja=baraja;
    }

   public Carta repartir(){
       return this.baraja.getCard();
   }

    public void pintarCarta(){
        System.out.println(" ___");
        System.out.println("|#   |");
        System.out.println("| ## |");
        System.out.println("|___#");
    } 
    

    
}
