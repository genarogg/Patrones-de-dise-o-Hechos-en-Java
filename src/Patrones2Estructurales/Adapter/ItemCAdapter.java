package Patrones2Estructurales.Adapter;

/**
 * @author Genarogg
 */
public class ItemCAdapter extends Item{
    private ItemC itemC;
    
    public ItemCAdapter(){
        System.out.println("ItemCAdapter");
        this.itemC = new ItemC();
    }
    @Override
    public void sell() {
        this.itemC.check();
    }

    @Override
    public void access() {
        this.itemC.check();
    }

    @Override
    public void send() {
        this.itemC.check();
        this.itemC.delete();
    }
}