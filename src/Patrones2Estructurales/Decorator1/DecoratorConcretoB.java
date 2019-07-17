package Patrones2Estructurales.Decorator;

/**
 * @author Genarogg
 */
public class DecoratorConcretoB extends Decorator{

    public DecoratorConcretoB(Componente componente) {
        super(componente);
    }
    
    @Override
    public void metodoA() {
        getComponente().metodoA();
        System.out.println("Metodo A decorador concreto B");
    }

    @Override
    public void metodoB() {
        getComponente().metodoB();
        System.out.println("Metodo B decorador concreto B");
    }

    @Override
    public void metodoC() {
        getComponente().metodoC();
        System.out.println("Metodo C decorador concreto B");
    }

    @Override
    public int getValor() {
        return this.getValor();
    }
}
