package Patrones2Estructurales.Adapter;

/**
 * @author Genarogg
 * 
 * El patrón adapter se utiliza para transformar una interfaz en otra,
 * de tal modo que una clase que no pueda utilizar la primera
 * haga uso de ella a través de la segunda
 */
public class Main {
    private static Item item;
    
    public static void main(String[] args) {
        ItemA itemA = new ItemA();
        ItemB itemB = new ItemB();
        item = new ItemCAdapter();
        
        itemA.access();
        itemB.access();
        item.access();
//        item = new ItemB();
//        item = new ItemA();
    }
}
