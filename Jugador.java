public class Jugador extends Persona{
    private int bote = 5000;
    

    //método para eliminar el dinero apostado y sumar o restar en caso de que pierda/gane
    //importante en caso de apuestas y pérdidas tiene que recibir el número en negativo 
    public void setMoney(int apuesta){
        this.bote+=apuesta;
    }
    public int getMoney(){
        return this.bote;
    }
}
