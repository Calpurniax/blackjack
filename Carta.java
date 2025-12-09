public class Carta{
    int valor;
    char palo;

    public Carta(int valor, char palo){
        this.valor=valor;
        this.palo=palo;
    }
    public void pintarCarta(){
        System.out.println(" ___");
        System.out.println("|"+this.valor +"  |");
        System.out.println("| "+ this.palo +" |");
        System.out.println("|__"+this.valor);
    }   
}