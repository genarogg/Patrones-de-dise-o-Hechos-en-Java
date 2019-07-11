package Patrones2Estructurales.Composite;

/**
 * @author Genarogg
 * 
 * El patrón Composite sirve para construir objetos 
 * complejos a partir de otros más simples y
 * similares entre sí, gracias a la composición
 * recursiva y a una estructura en forma de árbol
 */
public class Main {
    public static void main(String[] args) {
        new Main();
    }
    
    public Main(){
        create();
    }
    
    public void create(){
        Project mercado = new Project("Compra de Mercado");
        Project plaza = new Project("Plaza del  mercado");
        Project supermercado = new Project("Supermercado");
        Project carniceria = new Project("carniceria");
        
        addPlaza(plaza);
        mercado.addItemProject(plaza);
        addSuper(supermercado);
        mercado.addItemProject(supermercado);
//        addCarniceria(carniceria);
//        carniceria.addItemProject(carniceria);
//        
        mercado.imprimir();        
    }
    
    public void addPlaza(Project plaza){
        Todo papa = new Todo("Papa", "Pedro");
        Todo cebolla = new Todo("cebolla", "Maria");
        Todo tomate = new Todo("tomate", "Juan");
        
        plaza.addItemProject(papa);
        plaza.addItemProject(cebolla);
        plaza.addItemProject(tomate);
    }
    
    public void addSuper(Project supermercado){
        Todo aceite = new Todo("Aceite", "pedro");
        Todo sal = new Todo("Sal", "Juan");
        Todo salRefinada = new Todo("Sal refinada", "juan");
        
        sal.addItemProject(salRefinada);
        
        supermercado.addItemProject(aceite);
        supermercado.addItemProject(sal);
        
    }
}
