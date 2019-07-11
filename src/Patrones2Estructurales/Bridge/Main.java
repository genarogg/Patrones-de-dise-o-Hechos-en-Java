package Patrones2Estructurales.Bridge;

/**
 * @author Genarogg
 */
public class Main {
    public static void main (String [] args){
        Comportamiento comportamiento = new Unica();
        
        comportamiento.addItem("JOSE");
        comportamiento.addItem("JHON");
        comportamiento.addItem("BETO");
        comportamiento.addItem("ALVARO");
        comportamiento.addItem("ALEXYS");
        
        Lista base = new ListaBase();
        Lista enumerada = new ListaEnumerada();
        Lista vinetas = new ListaVineta();
        
        base.setComportamiento(comportamiento);
        enumerada.setComportamiento(comportamiento);
        vinetas.setComportamiento(comportamiento);
        
        System.out.println("Base");
        for(int i = 0; i<comportamiento.getSize(); i++){
	  System.out.println(base.getItem(i));
        }
        
        System.out.println("\nEnumerada");
        for(int i = 0; i<comportamiento.getSize(); i++){
	  System.out.println(enumerada.getItem(i));
        }
        
        System.out.println("\nViñetas");
        for(int i = 0; i<comportamiento.getSize(); i++){
	  System.out.println(vinetas.getItem(i));
        }
        
        
}
