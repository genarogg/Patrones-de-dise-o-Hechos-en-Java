package Patrones1Creacionales.Builder;

import java.util.ArrayList;

/**
 * @author Genarogg
 */

public class Builder{
    private Executer exec;
    private ArrayList <Integer> actions = new ArrayList <Integer>(); 

    public Executer getExec() {
        return exec;
    }

    public void setExec(Executer exec) {
        this.exec = exec;
    }

    public void setExecuter(int i){
        
        switch (i){
            case 1:
                this.exec = new Workflow();
                break;
        }
    }

    public void addAction(int i){
        this.actions.add(i);
    }
    
    public void setActions(){
        this.exec.loadActions(this.actions);
    }
}