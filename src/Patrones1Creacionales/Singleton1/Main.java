package Patrones1Creacionales.Singleton;

/**
 * @author Genarogg
 * 
 * Patron singleton
 * Patron basado en crear y mantener un objeto
 */

public class Main {
    
        private String x;
        private static Main singleton;
        
        private Main(String x){
	  this.x = x; 
        }
        
        public static Main getSingleton(String x){
	  if(singleton == null){
	      singleton = new Main(x);
	  }
	  else{
	      System.out.println("Ya tenemos uno");
	  }
	  return singleton;
        }

    public void setX(String x) {
        this.x = x;
    }
    
    public String getX(){
        return this.x;
    }
    public static void main(String[] args) {
        Main a = Main.getSingleton("a");        
        System.out.println(a.getX());
    }    
}