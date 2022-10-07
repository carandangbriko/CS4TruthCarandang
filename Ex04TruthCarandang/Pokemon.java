/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex04TruthCarandang;

/**
 *
 * @author TRUTH
 */
public class Pokemon {
    private String name;
    private String type;
    private int level;
    
    public Pokemon(String n, String t, int l){
        this.name = n;
        this.type = t;
        this.level = l;
    }
    
    public void levelUp(){
        level++;
        System.out.printf("Your %s leveled up to level %d!%n", name, level);
    }
}
