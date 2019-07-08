package Patrones1Creacionales.Prototipe1;

/**
 * @author Genarogg
 */
public abstract class PrototypeItem {
    protected String x;
    protected String y;
    protected String z;
    
    public abstract PrototypeItem Clone();

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getZ() {
        return z;
    }

    public void setZ(String z) {
        this.z = z;
    }
}