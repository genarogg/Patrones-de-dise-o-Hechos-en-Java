package Patrones2Estructurales.Facade;


/**
 * @author Genarogg
 */
public class Facade {
    A a;
    B b;
    C c;
    
    public Facade(){
        
    }
    
    public void imprime(){
        this.a = new A();
        this.b = new B();
        this.c = new C();
        
        a.CapturarInfo();
        b.ConoserColor();
        c.CargarHoja();
        c.imprimir();
    }   
}