package Patrones2Estructurales.Bridge;

import java.util.ArrayList;

/**
 * @author Genarogg
 */
public class Repetida implements Comportamiento{
    private ArrayList<String> lista = new ArrayList<String>();
    @Override
    public void addItem(String n) {
        lista.add(n);
    }

    @Override
    public String getItem(int i) {
        return lista.get(i);
    }

    @Override
    public int getSize() {
        return lista.size();
    }   
}