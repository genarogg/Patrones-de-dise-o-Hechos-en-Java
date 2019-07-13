package Patrones2Estructurales.Facade;

/**
 * @author Genarogg
 */
public class Main {
    public static void main(String[] args) {
        new Main();
    }
    
    public Main(){
        Facade f = new Facade();
        f.imprime();
    }
}