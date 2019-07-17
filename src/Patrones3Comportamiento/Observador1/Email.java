package Patrones3Comportamiento.observador;

/**
 *
 * @author Genarogg
 */
public class Email implements Observer {

    @Override
    public void notify(String m) {
        System.out.println("Estoy enviando correo con la data: " + m);
    }
}