package Patrones3Comportamiento.State;

/**
 * @author Genarogg
 * 
 * El patrón de diseño State se utiliza cuando el comportamiento de un 
 * objeto cambia dependiendo del estado del mismo. Por ejemplo: una 
 * alarma puede tener diferentes estados, como desactivada, activada, en 
 * configuración
 */

public class Main {
    public static void main(String[] args) {
        Contexto contexto = new Contexto();
        contexto.mostrar();
        
        contexto.setEstado(new EstadoConcretoB());
        contexto.mostrar();
        
        contexto.setEstado(new EstadoConcretoC());
        contexto.mostrar();
        
    }
}
