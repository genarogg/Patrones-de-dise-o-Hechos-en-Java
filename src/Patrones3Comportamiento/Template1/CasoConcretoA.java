package Patrones3Comportamiento.Template;

/**
 * @author Genarogg
 */
public class CasoConcretoA extends ClassAbstract{
    
    public CasoConcretoA(){
        System.out.println("Contructor de CasoConcretoA");
    }
    
    @Override
    public int sumar(int n) {
        return n + 1;
    }

    @Override
    public int multiplicar(int n) {
        return n * 0;
    }
}