import java.util.Scanner;

public class Main {

    public static void beginGame() {
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
                "El crupier deja de pedir cartas cuando llega a 17. " + "\n" +
                "Tu dinero para apostar es 5000, la apuesta inicial son 100" + "\n" +
                "Pulsa cualquier tecla para continuar");

    }

    public static void main(String[] args) {

        // Muestra el inicio del juego
        beginGame();

        // scanner para interactuar con el jugador
        Scanner sc = new Scanner(System.in);
        sc.nextLine();

        Mano mano1 = new Mano(true); // crea la mano del jugador
        Jugador player = new Jugador(mano1);
        Mano mano2 = new Mano(false); // crea la mano del crupier
        Crupier cr = new Crupier(mano2);

        // iniciamos la apuesta
        int apuestaInicial = 100;
        player.setMoney(-apuestaInicial);
        // bucle para continuar jugando mientras tengas bote
        while (player.getMoney() > 0) {
            // Creo una baraja nueva para evitar que se acaben las cartas
            Baraja baraja = new Baraja();
            baraja.barajear();

            // Reparte las cartas iniciales
            cr.addCard(baraja.getCard());
            cr.addCard(baraja.getCard());
            player.addCard(baraja.getCard());
            player.addCard(baraja.getCard());

            // boolean para crear el bucle de cada ronda
            boolean game = true;
            int ronda = 0;
            while (game) {
                System.out.println("\n=== CRUPIER ===");
                cr.showCards();
                System.out.println("=== JUGADOR ===");
                player.showCards(); // mostramos la mano del jugador
                System.out.print("Bote del jugador: " + player.getMoney());
                System.out.println(" * Apuesta: " + apuestaInicial);
                if (ronda == 0) {
                    System.out.println(
                            "Pulsa H para pedir otra carta y D para duplicar la apuesta (se te añadirá una carta al elegir esta opción)"
                                    + "\n" +
                                    "Pulsa cualquier otra letra para plantarte");
                    ronda++;
                    String optionString = sc.nextLine();
                    char option = optionString.toUpperCase().charAt(0);
                    switch (option) {
                        case 'H':
                            player.addCard(baraja.getCard());
                            break;
                        case 'D':
                            player.addCard(baraja.getCard());
                            apuestaInicial = apuestaInicial * 2;
                            break;
                        default:
                            game = false;
                    }
                } else {
                    System.out.println(
                            "Pulsa H para pedir otra carta"
                                    + "\n" +
                                    "Pulsa cualquier otra letra para plantarte");
                    String optionString = sc.nextLine();
                    char option = optionString.toUpperCase().charAt(0);
                    switch (option) {
                        case 'H':
                            player.addCard(baraja.getCard());
                            break;
                        default:
                            game = false;
                    }
                }
                if (player.getPoints() > 21) {
                    System.out.println("te pasaste!");
                    game = false;

                }
                if (cr.getPoints() < 17) {
                    cr.addCard(baraja.getCard());
                }
            }
            while (cr.getPoints() < 17) {
                cr.addCard(baraja.getCard());
            }
            System.out.println("JUGADOR: " + player.getPoints() + " CRUPIER " + cr.getPoints());
            if ((cr.getPoints() > 21 || cr.getPoints() < player.getPoints()) && player.getPoints() <= 21) {
                System.out.println("Enhorabuena has ganado " + apuestaInicial * 2);
                player.setMoney(apuestaInicial * 2);
            } else if (cr.getPoints() <= 21 && (player.getPoints() < cr.getPoints() ||player.getPoints()>21)) {
                System.out.println("Lo sentimos, has perdido " + apuestaInicial);
                player.setMoney(-apuestaInicial * 2);
            } else if (player.getPoints() == cr.getPoints()) {
                System.out.println("Empate");
                player.setMoney(apuestaInicial);
            } else {
                System.out.println("Algo falló");
            }
            System.out.println("Ahora tienes " + player.getMoney());
            System.out.println("¿Quieres jugar otra ronda? Pulsa s para continuar");
            String string = sc.nextLine();
            char exitOption = string.toUpperCase().charAt(0);
            switch (exitOption) {
                case 'S':
                    cr.cleanHand();
                    player.cleanHand();
                    ronda = 0;
                    break;
                default:
                    int money = player.getMoney();
                    player.setMoney(-money);
            }

        }

    }
}
