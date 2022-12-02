package ex07truthcarandang;


import ex07truthcarandang.Character;
import ex07truthcarandang.Character;

public class NPC extends Character implements Interactive {
    private String dialog;
    
    public void interact(){
        System.out.println(dialog);
    }
    
    public NPC(String n){
        super(n);
        this.dialog = "Hello, my name is " + n + ".";
    }
    public NPC(String n, Location l){
        super(n, l);
        this.dialog = "Hello, my name is " + n + "." + "\nThe power of science is amazing!"; //there's a character in every game that says this
    }
    public NPC(String n, String d){
        super(n);
        this.dialog = d;
    }
    public NPC(String n, Location l, String d){
        super(n, l);
        this.dialog = d;
    }
}
