package Patrones2Estructurales.Composite;

import java.util.ArrayList;

/**
 * @author Genarogg
 */
public class Todo implements ItemProject {
    private String name;
    private String responsable;
    private ArrayList<ItemProject> children;
    
    public Todo(String name, String reponsable){
        this.name = name;
        this.responsable = reponsable;
        this.children = new ArrayList<>();
    }
    
    @Override
    public void imprimir() {
        System.out.println("ToDo: " + this.name + ", responsable: " + this.responsable);
        for(ItemProject item : children){
	  System.out.println("\t\t");
	  item.imprimir();
        }
    }
    
    @Override
    public void addItemProject(ItemProject ip){
        children.add(ip);
    }
}