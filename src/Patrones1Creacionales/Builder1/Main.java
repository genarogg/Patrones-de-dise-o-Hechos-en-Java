package Patrones1Creacionales.Builder1;

/**
 * @author Genarogg
 * 
 * Patron Builder es utilizado para dividir clases en comun 
 * con un clase abstract, luego se centraliza la creacion de 
 * los abjetos por dio de la clase constructora(builder).
 */

public class Main{
    public static void main(String[] args){
        Builder constructor = new Builder();
                
        constructor.setExecuter(1);
        
        constructor.addAction(1);
        constructor.addAction(2);
        constructor.addAction(3);
        constructor.addAction(4);
        constructor.addAction(5);
        
        constructor.setActions();
        constructor.getExec().work();       
    } 
}
