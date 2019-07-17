package Patrones3Comportamiento.observador;

import java.util.ArrayList;

/**
 * @author Genarogg
 */
public class Perro {
    private int edad;
    private ArrayList <Observer> observerList = new ArrayList<>();
    
    
    public void setEdad(int edad){
        this.edad = edad;
        this.notifyObsevers();
    }
    
    public void addObserver(Observer o){
        observerList.add(o);
    }
    
//    @Override
    public void notifyObsevers(){
        for(Observer iter : observerList){
            iter.notify("" + this.edad);
        }
    }
}