package Patrones3Comportamiento.Memento;

/**
 * Este patron de diseño guarda el estado del archivo 
 * y permite permite restaurarlo
 *
 * @author Genarogg
 */
public class Main {
    public static void main(String[] args){
        CareTaker caretaker = new CareTaker();
        Originator originator = new Originator();
        
        originator.seState("A");
        originator.seState("B");
        originator.seState("C");
        
        caretaker.addMemento(originator.save());
        Memento memento = caretaker.getMemento(0);
        System.out.println(memento.getState());
        
        originator.seState("D");
        originator.seState("E");
        
        caretaker.addMemento(originator.save());
        Memento memento2 = caretaker.getMemento(1);
        System.out.println(memento2.getState());  
    }
}