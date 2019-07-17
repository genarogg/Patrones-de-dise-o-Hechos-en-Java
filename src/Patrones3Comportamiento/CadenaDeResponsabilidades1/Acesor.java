package Patrones3Comportamiento.CadenaDeResponsabilidades;

/**
 * @author Genarogg
 */
public class Acesor implements Autoriza{
    Autoriza sucesor;
    
    public void setSucesor(Autoriza s){
        this.sucesor = s;
    }

    @Override
    public void autorizar(int n) {
        if(n <= 2000){
            System.out.println("Acesor autoriza: " + n);
        }
        else{
            this.sucesor.autorizar(n);
        }
    }
}