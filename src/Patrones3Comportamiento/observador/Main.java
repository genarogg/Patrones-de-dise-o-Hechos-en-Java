package Patrones3Comportamiento.observador;

/**
 * @author Genarogg
 * 
 * El patron de diseño Observador es utilizado para dar 
 * notificaciones del estado de las porpiedades de los
 * objetos
 */
public class Main {
    public static void main(String[] args) {
        Person persona = new Person();
        Slack slack = new Slack();
        Email email = new Email();
        
        persona.addObserver(slack);
        persona.addObserver(email);
        persona.setNombre("GenaroGG");
        
        Perro perro = new Perro();
        perro.addObserver(email);
        perro.setEdad(12);
    }
}