package Patrones3Comportamiento.Memento;

import java.util.ArrayList;

/**
 * @author Genarogg
 */
public class CareTaker {
    private ArrayList<Memento> mementos = new ArrayList<>();
    
    public void addMemento(Memento memento){
        this.mementos.add(memento);
    }
    
    public Memento getMemento(int momento){
        return mementos.get(momento);
    }
}