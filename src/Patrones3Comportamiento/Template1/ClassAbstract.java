package Patrones3Comportamiento.Template;

/**
 * @author Genarogg
 */
public abstract class ClassAbstract {
    public int getNum(int num){
        this.show();
        int n = this.sumar(num);
        n = this.multiplicar(n);
        return n;
    }
    
    public void show(){
        System.out.println("Iniciando algoritmo");
    }
    
    public abstract int sumar(int n);
    public abstract int multiplicar(int n);
}