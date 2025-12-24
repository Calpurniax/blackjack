import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Crea la baraja
        Baraja baraja = new Baraja();
        baraja.barajear();

        Mano mano1 = new Mano(true); // crea la mano del jugador
        Jugador player = new Jugador(mano1);
        Mano mano2 = new Mano(false); // crea la mano del crupier
        Crupier cr = new Crupier(mano2);

        // Reparte las cartas iniciales
        cr.addCard(baraja.getCard());
        cr.addCard(baraja.getCard());
        player.addCard(baraja.getCard());
        player.addCard(baraja.getCard());

        Scanner sc = new Scanner(System.in);      

       // Muestra el inicio del juego
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
                "En tu primera jugada puedes elegir (D) Double Down para duplicar tu apuesta, pero debés pedir exactamente una carta más antes de plantarte."
                +
                "\n" +
                "En caso de empate, la apuesta se devuelve al jugador." +
                "\n" +
                "El crupier deja de pedir cartas cuando llega a 17. "+"\n"+
                "Pulsa cualquier tecla para continuar");
            
           sc.nextLine();

        // Aqui iria el dinero total del jugador (está dentro del jugador)
        // informar de que la apuesta para inciar el juego es x y se descuenta automáticamente del total

        System.out.println("\n=== CRUPIER ===");
        cr.showCards();
        System.out.println("=== JUGADOR ===");
        player.showCards(); // mostramos la mano del jugador

        // aqui deberia ir la parte en la que nos pregunta si queremos pedir otra carta
        // (H)
        // plantarse y dejar de pedir cartas (S), duplicar tu apuesta (D)  
        
    }
}
