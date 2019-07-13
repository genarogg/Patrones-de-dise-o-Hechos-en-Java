package Patrones2Estructurales.Facade;

import javax.swing.JOptionPane;

/**
 * @author Genarogg
 * 
 * Disponemos de un sistema complejo que, al ser muy flexible, 
 * requiere de la configuración de muchos parámetros para conseguir 
 * un fin concreto. Por otro lado, nuestro sistema cliente pretende 
 * utilizar parte de la funcionalidad que el primer sistema ofrece 
 * pero muchas de las operaciones de configuración son siempre las mismas.
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