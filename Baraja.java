import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Baraja {
    Carta[] baraja;

    public void barajear(){
        //he encontrado este método (Collections.shuffle) para mezclar arrays, pero se 
        //usa con objetos lista y no con objetos array
        //entonces es pasar el array a lista
         List<Carta> barajaLista = Arrays.asList(baraja);

        // se mezcla
        Collections.shuffle(barajaLista);

        // Se pasa a array
        Carta[] barajaMezclada = barajaLista.toArray(new Carta[0]);
        this.baraja=barajaMezclada;
    }
}
