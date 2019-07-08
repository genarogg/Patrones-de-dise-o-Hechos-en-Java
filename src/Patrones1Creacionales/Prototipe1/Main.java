package Patrones1Creacionales.Prototipe1;

import java.util.ArrayList;

/**
 * @author Genarogg
 * 
 * Con el patron Prototype se clonan los objetos
 * Optimiza el uso de la memoria al crear objetos
 */
public class Main {
    public static void main(String[] args) {
        PrototypeItem uno = new ItemB("bdapp", "Genarogg", "Usuarios");
        
        ArrayList items = new ArrayList<>();
        
        for(int x=0; x < 10; x++){
	  PrototypeItem item = uno.Clone();
	  
	  items.add(item);
        }
        
        int t = items.size();
        for(int y = 0; y < t; y++){
	  System.out.println(items.get(y));
        }
    }
}
