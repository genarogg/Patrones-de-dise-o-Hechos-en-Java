package Patrones3Comportamiento.CadenaDeResponsabilidades;

import javax.swing.JOptionPane;

/**
 * @author Genarogg
 * 
 * El patrón de diseño Chain of Responsibility es un patrón 
 * de comportamiento que evita acoplar el emisor de una petición 
 * a su receptor dando a más de un objeto la posibilidad de 
 * responder a una petición. Para ello, se encadenan los receptores 
 * y pasa la petición a través de la cadena hasta que es procesada 
 * por algún objeto
 */
public class Main {
    public static void main(String[] args) {
        Acesor a = new Acesor();
        Coordinador c = new Coordinador();
        Gerente g = new Gerente();
        
        a.setSucesor(c);
        c.setSucesor(g);
        
        //Resibe un valor numerico para autirizar un prestamo  ejemplo 40 000
        int valor = Integer.parseInt(JOptionPane.showInputDialog
                    (null, "Introduce el valor del Prestamo", "Prestamo"));
        
        a.autorizar(valor);
    }
}
