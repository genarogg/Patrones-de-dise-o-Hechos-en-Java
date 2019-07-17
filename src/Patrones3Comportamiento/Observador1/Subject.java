package Patrones3Comportamiento.observador;

/**
 * @author Genarogg
 */
public interface Subject {
    public void addObserver(Observer o);
    //public void delObserver(Observer o);
    public void NotifyObsevers();
}