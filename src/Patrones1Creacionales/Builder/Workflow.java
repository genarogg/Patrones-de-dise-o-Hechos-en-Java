package Patrones1Creacionales.Builder;

import java.util.ArrayList;

/**
 * @author Genarogg
 */

public class Workflow implements Executer{
    ArrayList <Integer> Accions  = new ArrayList<>();

    public void getElement(){
        System.out.println("Estoy obteniendo los elementos nesesarios");
    }

    public void proceso(){
        System.out.println("Estoy procesando todos los elementos enviados");
    }

    public void end(){
        System.out.println("Termino el gran proceso, fue duro pero lo termino");
    }
    @Override
    public void loadActions(ArrayList <Integer> x){
        this.Accions = x;
    }

    @Override
    public void work(){
        for(Integer accion : this.Accions){
	  switch(accion){
	      case 1:
	        this.getElement();
	        break;
	      case 2:
		this.proceso();
		break;
	      case 3:
		this.end();
	      default:
		System.out.println("Accion no Permitida " + accion);
	  }
        }
    }
} 