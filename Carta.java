public class Carta{
    private String valor;
    private char palo;
    private int puntos;

    public Carta(String valor, char palo){
        this.valor=valor;
        this.palo=palo;
        pointsCart();
    }
    /*función set para poder cambiar el as para que valga 1 
    si te pasas de 21*/
    public void setPuntos(int puntos){
        this.puntos = puntos;
    }
    /*Metodo para acceder a los puntos de cada carta */
    public int getPuntos(){
        return this.puntos;
    }
    /* Método para pintar las cartas, devuelve un array de strings */
    public String[] pintarCarta(){
        //descuadra la imagen cuando es un 10 porque tiene dos cifras, asi que hay que poner un espacio menos en la segunda línea
        if(this.valor=="10"){
            String[] cartaString = { " ____     ", "|"+this.valor +"  |    ", "|  "+ this.palo +" |    ", "|___"+this.valor+"     "};
            return cartaString;
        }
        String[] cartaString = { " ____     ", "|"+this.valor +"   |    ", "|  "+ this.palo +" |    ", "|___"+this.valor+"     "};
        return cartaString;
    } 
    /*Método para la primera carta del crupier */
     public String[] pintarCartaOculta(){
        String[] cartaString = { " ___     ", "|#   |   ", "| ## |   ", "|__#     "};
        return cartaString;       
    } 

    /*Método para calcular los puntos de cada carta */
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