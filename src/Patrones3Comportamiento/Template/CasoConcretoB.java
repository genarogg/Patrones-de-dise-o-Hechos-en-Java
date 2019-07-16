package Patrones3Comportamiento.Template;

/** 
 * @author Genarogg
 */
public class CasoConcretoB extends ClassAbstract{

    @Override
    public int sumar(int n) {
        return n + 5;
    }

    @Override
    public int multiplicar(int n) {
        return n * 1000;
    }
}