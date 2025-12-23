public class Crupier extends Persona{   
    

    //constructor, necesita una mano con visible = false
    public Crupier (Mano mano){
        super(mano);
    }   

    public void showCards(){
        pintarCarta();
    }
    public void pintarCarta(){
        System.out.println(" ___");
        System.out.println("|#   |");
        System.out.println("| ## |");
        System.out.println("|___#");
    } 
    

    
}
