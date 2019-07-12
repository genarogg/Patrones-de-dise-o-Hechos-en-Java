package Patrones2Estructurales.Decorator;

/**
 * @author Genarogg
 */
public abstract class Decorator implements Componente{
    private Componente componente;
    
    public Decorator(Componente componente){
        this.componente = componente;
    }
    
    public Componente getComponente(){
        return componente;
    }
}
