package Patrones1Creacionales.Prototipe1;

/**
 * @author Genarogg
 */
public class ItemA extends PrototypeItem{
    
    public ItemA(String x, String y, String z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    @Override
    public PrototypeItem Clone() {
        return new ItemA(this.x, this.y, this.z);
    }

    @Override
    public String toString() {
        return "ToStringA";
    }
    
    
}