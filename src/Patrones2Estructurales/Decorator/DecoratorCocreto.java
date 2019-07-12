package Patrones2Estructurales.Decorator;

/**
 * @author Genarogg
 */
public class DecoratorCocreto extends Decorator{

    public DecoratorCocreto(Componente componente) {
        super(componente);
    }
    
    @Override
    public void metodoA() {
        getComponente().metodoA();
        System.out.println("Metodo A decorador concreto");
    }

    @Override
    public void metodoB() {
        getComponente().metodoB();
        System.out.println("Metodo B decorador concreto");
    }

    @Override
    public void metodoC() {
        getComponente().metodoC();
        System.out.println("Metodo C decorador concreto");
    }

    @Override
    public int getValor() {
        return this.getValor();
    }
}