package Patrones2Estructurales.Decorator;

/**
 * @author Genarogg
 */
public class ComponenteConcreto implements Componente{
    private int valor = 10;
       
    public ComponenteConcreto(int valor){
        this.valor = valor;
    }
    
    @Override
    public void metodoA() {
        System.out.println("MetodoA Componente concreto");
    }

    @Override
    public void metodoB() {
        System.out.println("MetodoB Componente concreto");
    }

    @Override
    public void metodoC() {
        System.out.println("MetodoC Componente concreto");
    }

    @Override
    public int getValor() {
        return this.valor;
    }   
}