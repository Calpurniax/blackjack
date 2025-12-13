import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Baraja {
    Carta[] baraja =  new Carta[52];   
    
    public Baraja() {     
        Set<String> setValor = new HashSet<>(Arrays.asList("A", "2", "3", "4","5","6","7","8","9","10","J","Q","K"));
        Set<Character> setPalo = new HashSet<>(Arrays.asList('D', 'C', 'P', 'T'));
        int cont =0;
        for (String i: setValor) {
            for (Character j: setPalo) {   
                Carta card =new Carta(i,j);
                this.baraja[cont]=(card);
                cont++;
            }
        }
    }

    public void barajear() {
        // he encontrado este método (Collections.shuffle) para mezclar arrays, pero se
        // usa con objetos lista y no con objetos array
        // entonces es pasar el array a lista
        List<Carta> barajaLista = Arrays.asList(baraja);

        // se mezcla
        Collections.shuffle(barajaLista);

        // Se pasa a array
        Carta[] barajaMezclada = barajaLista.toArray(new Carta[0]);
        this.baraja = barajaMezclada;   
    }
    public static void main(){
        Baraja baraja = new Baraja();
        baraja.barajear();    
    }
}
