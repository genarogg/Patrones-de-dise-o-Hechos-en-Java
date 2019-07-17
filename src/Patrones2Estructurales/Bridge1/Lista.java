package Patrones2Estructurales.Bridge;

/**
 * @author Genarogg
 */
public abstract class Lista {
    
    protected Comportamiento comportamiento;
    
    public void setComportamiento(Comportamiento c){
        this.comportamiento = c;
    }
    
    public String getItem(int i){
        if(i < comportamiento.getSize()){
	  return comportamiento.getItem(i);
        }
        return "";
    }
    
    public int getSize(){
        return comportamiento.getSize();
    }
}
