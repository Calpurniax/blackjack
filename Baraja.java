import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Baraja {
    Carta[] baraja;
    //Set<List<Carta>> baraja = new HashSet<>();

    //el problema es que no ve la lista de objetos carta como una lista de objetos

    public Baraja() {     
        ArrayList<String> valores = new ArrayList<>();
        Set<String> setValor = new HashSet<>(Arrays.asList("1", "2", "3", "4","5","6","7","8","9","10","J","Q","K"));
        Set<Character> setPalo = new HashSet<>(Arrays.asList('D', 'C', 'P', 'T'));

        //se puede cambiar esto a un array? para q luego se pueda poner = a baraja o como hacemos esto

        Set<List<Object>> cartesianProduct = new HashSet<>();

         for (String i: setValor) {
            for (Character j: setPalo) {           
                List<Object> tuple = Arrays.asList(i,j);
                cartesianProduct.add(tuple);   
         }
        }
        this.baraja=cartesianProduct;

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
}
