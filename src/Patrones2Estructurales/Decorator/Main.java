package Patrones2Estructurales.Decorator;

/**
 * @author Genarogg
 * 
 * El patrón Decorator responde a la necesidad de 
 * añadir dinámicamente funcionalidad a un Objeto. 
 * Esto nos permite no tener que crear sucesivas 
 * clases que hereden de la primera incorporando la 
 * nueva funcionalidad, sino otras que la implementan y 
 * se asocian a la primera.
 */

public class Main {
    public static void main(String[] args) {
        Componente componente = new ComponenteConcreto(1);
        componente = new DecoratorCocreto(componente);
        componente.metodoA();
        componente.metodoB();
        componente.metodoC();
    }
}
