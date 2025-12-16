import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Baraja {
    //Carta[] baraja =  new Carta[52];   
    
    ArrayList<Carta> baraja = new ArrayList<Carta>();
    
    public Baraja() {     
        Set<String> setValor = new HashSet<>(Arrays.asList("A", "2", "3", "4","5","6","7","8","9","10","J","Q","K"));
        Set<Character> setPalo = new HashSet<>(Arrays.asList('D', 'C', 'P', 'T'));
        //int cont =0;
        for (String i: setValor) {
            for (Character j: setPalo) {   
                Carta card =new Carta(i,j);
                this.baraja.add(card);
                // this.baraja[cont]=(card);
                // cont++;
            }
        }
    }

    public void barajear() {
        Collections.shuffle(baraja);   
    }

    public Carta getCard(){
        return baraja.get(0); 
    }

    public static void main(){
        Baraja baraja = new Baraja();
        baraja.barajear(); 
        Carta lastCard = baraja.getCard();
        lastCard.pintarCarta();
         
        int valor = lastCard.getPuntos();

       // int valor = Valores.getValor(lastCard);
       System.out.println("el valor de la última carta es "+ valor); 
       Crupier cr = new Crupier(baraja);       
       cr.pintarCarta();


    }   
}
