package Patrones2Estructurales.Composite;

import java.util.ArrayList;

/**
 * @author Genarogg
 */
public class Project implements ItemProject{
    private String name;
    private ArrayList<ItemProject> children;
    
    public Project(String name){
        this.name = name;
        this.children = new ArrayList<ItemProject>();
    }

    @Override
    public void imprimir() {
        System.out.println("Nombre: " + this.name);
        
        for(ItemProject item : children){
	  System.out.print("\t");
	  item.imprimir();
        }
    }

    @Override
    public void addItemProject(ItemProject ip) {
        children.add(ip);
    }   
}
