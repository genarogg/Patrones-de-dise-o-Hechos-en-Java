package Patrones3Comportamiento.CadenaDeResponsabilidades;

/**
 * @author Genarogg
 */
public class Coordinador  implements Autoriza{
    Autoriza sucesor;
    
    public void setSucesor(Autoriza s){
        this.sucesor = s;
    }

    @Override
    public void autorizar(int n) {
        if(n <= 20000){
            System.out.println("Coordinador autoriza: " + n);
        }
        else{
            this.sucesor.autorizar(n);
        }
    }
}