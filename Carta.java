public class Carta{
    String valor;
    char palo;
    private int puntos;

    public Carta(String valor, char palo){
        this.valor=valor;
        this.palo=palo;
        pointsCart();

    }
    //función set para poder cambiar el as para que valga 1 
    //si te pasas de 21
    public void setPuntos(int puntos){
        this.puntos = puntos;
    }
    public int getPuntos(){
        return this.puntos;
    }

    public void pintarCarta(){
        System.out.println(" ___");
        System.out.println("|"+this.valor +"  |");
        System.out.println("| "+ this.palo +" |");
        System.out.println("|__"+this.valor);
    } 
    
     public void pointsCart() {
        switch (this.valor) {
            case "A":
                this.puntos = 11;
                break;
            case "2":
                this.puntos=2;
                break;
            case "3":
                this.puntos=3;
                break;
            case "4":
                this.puntos=4;
                break;
            case "5":
               this.puntos=5;
               break;
            case "6":
                this.puntos=6;
                break;
            case "7":
                this.puntos=7;
                break;
            case "8":
                this.puntos=8;
                break;
            case "9":
                this.puntos=9;
                break;
            case "10":
            case "J":
            case "Q":
            case "K":
                this.puntos=10;
                break;
            default:
                this.puntos=0;
        }
    }
}