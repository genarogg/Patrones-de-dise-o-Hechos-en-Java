package Patrones3Comportamiento.observador;

import java.util.ArrayList;

/**
 * @author Genarogg
 */
public class Person {
    private String nombre;
    private ArrayList <Observer> observerList = new ArrayList<Observer>();
    
    public void setNombre(String nombre){
        this.nombre = nombre;
        this.notifyObsevers();
    }
    
    public void addObserver(Observer o){
        observerList.add(o);
    }
    
//    @Override
    public void notifyObsevers(){
        for(Observer iter : observerList){
            iter.notify(this.nombre);
        }
    }
}