/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex01TruthCarandang;

/**
 *
 * @author TRUTH
 */
public class Ex01TruthCarandang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String poke1 = "Flareon";
        String type1 = "Fire";
        int level1 = 20;
        String poke2 = "Vaporeon";
        String type2 = "Water";
        int level2 = 34;
        String poke3 = "Jolteon";
        String type3 = "Electric";
        int level3 = 36;
        int totalLevel = level1+level2+level3;
        boolean sharedType = (type1==type2);
        boolean higherLevel = (level2<level3);
        System.out.printf("Pokemon 1 %nName: %s%nType: %s%nCurrent Level: %d%n%n", poke1, type1, level1);
        System.out.printf("Pokemon 2 %nName: %s%nType: %s%nCurrent Level: %d%n%n", poke2, type2, level2);
        System.out.printf("Pokemon 3 %nName: %s%nType: %s%nCurrent Level: %d%n%n", poke3, type3, level3);
        System.out.printf("Total party level: %d%nFlareon and Vaporeon share the same typing: %s%nJolteon has a higher level than Vaporeon: %s%n", totalLevel, sharedType, higherLevel);
    }
    
}
