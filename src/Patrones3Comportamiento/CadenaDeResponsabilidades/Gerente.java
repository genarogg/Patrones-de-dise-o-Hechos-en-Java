package Patrones3Comportamiento.CadenaDeResponsabilidades;

/**
 * @author Genarogg
 */
public class Gerente implements Autoriza{

    @Override
    public void autorizar(int n) {
        System.out.println("Gerente autoriza: " + n);
 
    }
}
