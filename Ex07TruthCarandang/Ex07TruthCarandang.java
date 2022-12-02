/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex07truthcarandang;

/**
 *
 * @author TRUTH
 */
public class Ex07TruthCarandang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Monster hoppip = new GrassType("Hoppip", 20, 3);
        Monster cyndaquil = new FireType("Cyndaquil", 20, 3);
        Location newbark = new Location("New Bark Town", "The Town Where Winds of a New Beginning Blow");
        Location route = new Location("Route 29");
        NPC john = new NPC("John", newbark);
        Trainer ethan = new Trainer("Ethan", newbark, cyndaquil);
        
        ethan.inspect(newbark);
        ethan.inspect(john);
        ethan.travel(route);
        ethan.inspect(hoppip);
        
        while(hoppip.getHP() >= hoppip.getMaxHP() * 2/10){
            hoppip.attack(cyndaquil);
            ethan.battle(hoppip);
        }
        ethan.capture(hoppip);
    }
}
