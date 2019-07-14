package Patrones3Comportamiento.Memento;

/**
 * @author Genarogg
 */
public class Originator {
    private String state;
    
    public void seState(String state){
        this.state = state;
    }
    
    public Memento save(){
        return new Memento(state);
    }
    
    public void restore(Memento memento){
        state = memento.getState();
    }
}
