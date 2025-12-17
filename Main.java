public class Main {
    public static void main(String[] args) {

        // Crea la baraja
        Baraja baraja = new Baraja();
        baraja.barajear();

        Mano manoJugador = new Mano(true); //crea la mano del jugador
        Mano manoCrupier = new Mano(true); //crea la mano del crupier

        //Reparte las cartas iniciales
        manoJugador.añadirCarta(baraja.getCard());
        manoJugador.añadirCarta(baraja.getCard());

        manoCrupier.añadirCarta(baraja.getCard());
        manoCrupier.añadirCarta(baraja.getCard());

        //muestra el inicio del juego
        System.out.println("BLACKJACK \n");

        System.out.println("Reglas:" + "\n" +
                "Intentá llegar lo más cerca posible a 21 sin pasarte." +
                "\n" +
                "Los Reyes, Reinas y Jotas valen 10 puntos." +
                "\n" +
                "Los Ases valen 1 u 11 puntos." +
                "\n" +
                "Las cartas del 2 al 10 valen su valor numérico." +
                "\n" +
                "(H) Hit: pedir otra carta." +
                "\n" +
                "(S) Stand: plantarse y dejar de pedir cartas." +
                "\n" +
                "En tu primera jugada puedes elegir (D) Double Down para duplicar tu apuesta, pero debés pedir exactamente una carta más antes de plantarte." +
                "\n" +
                "En caso de empate, la apuesta se devuelve al jugador." +
                "\n" +
                "El crupier deja de pedir cartas cuando llega a 17. \n");

        System.out.println("=== JUGADOR ===");

        //aqui iria el dinero total del jugador
        //tambien otra linea que ponga cuanto queremos apostar o si queremos salir del juego

        manoJugador.mostrarMano(); //mostramos la mano del jugador

        //aqui deberia ir la parte en la que nos pregunta si queremos pedir otra carta (H)
        //plantarse y dejar de pedir cartas (S), duplicar tu apuesta (D)

        System.out.println("\n=== CRUPIER ===");
        manoCrupier.mostrarMano(); //mostramos la mano del crupier
    }
}
