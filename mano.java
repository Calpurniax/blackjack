import java.util.ArrayList;

public class Mano {

    private ArrayList<Carta> cartas;
    private boolean manoVisible; //

    /* Constructor para crear el objeto mano, será visible o no en función de 
    si es la mano del crupier, cuya primera carta está oculta*/ 
    public Mano(boolean manoVisible) {
        this.cartas = new ArrayList<>();
        this.manoVisible = manoVisible;
    }

    /*método para añadir una carta a la mano.
     Recibe una carta como parámetro.*/
    public void añadirCarta(Carta carta) {
        cartas.add(carta);
    }

    /*método para vaciar la mano cuando termina la ronda */ 
    public void limpiarMano() {
        cartas.clear();
    }

    /*Para calcular los puntos totales*/ 
    public int calcularPuntos() {
        int total = 0;
        int ases = 0;

        // Sumamos los puntos
        for (Carta cart : cartas) {
            total += cart.getPuntos();
            if (cart.getPuntos() == 11) {
                ases++; // incremento valor del as
            }
        }

        // usamos un while por si nos pasamos de 21 y convertimos el as de 11 a 1
        while (total > 21 && ases > 0) {
            total -= 10; //
            ases--; // reduzco el valor del as
        }
        return total;
    }

    /* Mostrar cartas teniendo en cuenta que la mano sea visible o no
    si no es visible la primera posicion del array de la mano será el método de la carta oculta*/ 
    public void mostrarMano() {
       List<String[]> cardsAsStrings = new ArrayList<>();
        if (!manoVisible) {            
            int i = 0;
            for (Carta cart : cartas) {
                if (i == 0) {
                    cardsAsStrings.add(cart.pintarCartaOculta());
                    i++;
                } else
                    cardsAsStrings.add(cart.pintarCarta());
            }

        } else {
            for (Carta cart : cartas) {
                cardsAsStrings.add(cart.pintarCarta());
            }
            System.out.println("Puntos: " + calcularPuntos());
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < cardsAsStrings.size(); j++) {
                System.out.print(cardsAsStrings.get(j)[i]);
            }
            System.out.println(" ");
        }        
    }

    // Getter visibilidad
    public boolean getVisible() {
        return manoVisible;
    }

    // Setter visibilidad
    public void setVisible(boolean manoVisible) {
        this.manoVisible = manoVisible;
    }
}
