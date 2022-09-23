/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex03TruthCarandang;

/**
 *
 * @author TRUTH
 */
public class Ex03TruthCarandang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pokemon vaporeon = new Pokemon("Vaporeon", "Water", 34);
        Pokemon charizard = new Pokemon("Charizard", "Fire/Flying", 36);
        Pokemon raichu = new Pokemon("Raichu", "Electric", 33);
        Song cannedHeat = new Song("Canned Heat", "Funk", 76484483, 128);
        Song virtualInsanity = new Song("Virtual Insanity", "Funk", 124863550, 92);
        Singer jamiroquai = new Singer("Jamiroquai", 25, 15000.00, cannedHeat);
        
        jamiroquai.performForAudience(12);
        jamiroquai.changeFavSong(virtualInsanity);
    }
    
}
