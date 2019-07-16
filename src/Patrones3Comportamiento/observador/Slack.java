package Patrones3Comportamiento.observador;

/**
 * @author Genarogg
 */
public class Slack implements Observer{

    @Override
    public void notify(String m) {
        System.out.println("Estoy notificando a slack: " + m);
    }
}