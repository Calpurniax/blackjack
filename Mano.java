import java.util.ArrayList;

public class Mano {

    private ArrayList<Carta> cartas;
    private boolean manoVisible; //

    // Constructor para crear el objeto
    public Mano(boolean manoVisible) {
        this.cartas = new ArrayList<>();
        this.manoVisible = manoVisible;
    }

    // metodo para añadir una carta a la mano.
    //Recibe una carta como parámetro.
    public void añadirCarta(Carta carta) {
        cartas.add(carta);
    }

    // metodo para vaciar la mano cuando termina la ronda
    public void limpiarMano() {
        cartas.clear();
    }

    // para calcular los puntos totales
    public int calcularPuntos() {
        int total = 0; 
        int ases = 0;

        // Sumamos los puntos
        for (Carta cart : cartas) {
            total += cart.getPuntos();
            if (cart.getPuntos() == 11) {
                ases++; //incremento valor del as
            }
        }

        // usamos un while por si nos pasamos de 21 y convertimos el as de 11 a 1
        while (total > 21 && ases > 0) {
            total -= 10; //
            ases--; //reduzco el valor del as
        }
        return total;
    }

    // Mostrar cartas teniendo en cuenta que la mano sea visble o no
    public void mostrarMano() {
        if (!manoVisible) {
            System.out.println("Carta oculta");
            return;
        }

        for (Carta cart : cartas) {
            cart.pintarCarta();
        }

        System.out.println("Puntos: " + calcularPuntos());
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
