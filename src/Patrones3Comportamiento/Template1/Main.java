package Patrones3Comportamiento.Template;

/**
 * @author Genarogg
 * 
 * patron de diseño con el cual se pueden encapsular agoritmos
 */
public class Main {
    public static void main(String[] args) {
        CasoConcretoA a = new CasoConcretoA();
        CasoConcretoB b = new CasoConcretoB();
        
        int n = a.getNum(1);
        System.out.println(n);
        
        int x = b.getNum(1);
        System.out.println(x);  
    }
}