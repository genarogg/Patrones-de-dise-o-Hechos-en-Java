package Patrones2Estructurales.Bridge;

/**
 * @author Genarogg
 */
public class ListaVineta extends Lista{
    @Override
    public String getItem(int i){
        if(i < super.getSize()){
	  return "* " + super.getItem(i);
        }
        return "";
    } 
}