package Patrones3Comportamiento.CadenaDeResponsabilidades;

import javax.swing.JOptionPane;

/**
 * @author Genarogg
 */
public class Main {
    public static void main(String[] args) {
        Acesor a = new Acesor();
        Coordinador c = new Coordinador();
        Gerente g = new Gerente();
        
        a.setSucesor(c);
        c.setSucesor(g);
        
        int valor = Integer.parseInt(JOptionPane.showInputDialog
                    (null, "Introduce el valor del Prestamo", "Prestamo"));
        
        a.autorizar(valor);
    }
}
