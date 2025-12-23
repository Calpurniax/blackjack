import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Baraja {    

    ArrayList<Carta> baraja = new ArrayList<Carta>();
    
    public Baraja() {     
        Set<String> setValor = new HashSet<>(Arrays.asList("A", "2", "3", "4","5","6","7","8","9","10","J","Q","K"));
        Set<Character> setPalo = new HashSet<>(Arrays.asList('D', 'C', 'P', 'T'));
        for (String i: setValor) {
            for (Character j: setPalo) {   
                Carta card =new Carta(i,j);
                this.baraja.add(card);
            }
        }
    }

    public void barajear() {
        Collections.shuffle(baraja);   
    }

    public Carta getCard(){
        return baraja.remove(0); 
    }
    public void getLenght(){
        System.out.println(baraja.size());
    }

    public static void main(){
        Baraja baraja = new Baraja();
        baraja.barajear(); 
        baraja.getLenght();
        Carta lastCard = baraja.getCard();
        baraja.getLenght();
        lastCard.pintarCarta();
         
        int valor = lastCard.getPuntos();

       System.out.println("el valor de la última carta es "+ valor); 
      // Crupier cr = new Crupier(baraja);       
      // cr.pintarCarta();


    }   
}
