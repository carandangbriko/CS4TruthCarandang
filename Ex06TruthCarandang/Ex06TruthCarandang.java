/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex06TruthCarandang;

/**
 *
 * @author TRUTH
 */
public class Ex06TruthCarandang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int turnCount;
        Monster cyndaquil = new FireType("Cyndaquil", 80, 30);
        Monster chikorita = new GrassType("Chikorita", 120, 24);
        Monster totodile = new WaterType("Totodile", 100, 27);
        
        turnCount = 1;
        System.out.println("\n=======================\n" + chikorita.getName() + " V.S. " + cyndaquil.getName() + "\n=======================");
        while(chikorita.getHP()!= 0 || cyndaquil.getHP()!= 0){
            System.out.println("\n=== Turn " + turnCount + " ===");
            cyndaquil.attack(chikorita);
            if(chikorita.getHP()== 0){
                break;
            }
            chikorita.attack(cyndaquil);
            if(cyndaquil.getHP()== 0){
                break;
            }
            if(turnCount % 5 == 0){
                cyndaquil.special();
            }
            if(turnCount % 7 == 0){
                chikorita.special();
            }
            turnCount++;
        }
        turnCount = 1;
        cyndaquil.resetHP();
        System.out.println("\n=======================\n" + chikorita.getName() + " V.S. " + totodile.getName() + "\n=======================");
        while(chikorita.getHP()!= 0 || totodile.getHP()!= 0){
            System.out.println("\n=== Turn " + turnCount + " ===");
            totodile.attack(chikorita);
            if(chikorita.getHP()== 0){
                break;
            }
            chikorita.attack(totodile);
            if(totodile.getHP()== 0){
                break;
            }
            if(turnCount % 3 == 0){
                totodile.charge();
            }
            if(turnCount % 10 == 0){
                chikorita.special();
            }
            if(turnCount % 15 == 0){
                totodile.special();
            }
            turnCount++;
        }
        turnCount = 1;
        totodile.resetHP();
        System.out.println("\n=======================\n" + cyndaquil.getName() + " V.S. " + totodile.getName() + "\n=======================");
        while(cyndaquil.getHP()!= 0 || totodile.getHP()!= 0){
            System.out.println("\n=== Turn " + turnCount + " ===");
            cyndaquil.attack(totodile);
            if(totodile.getHP()== 0){
                break;
            }
            totodile.attack(cyndaquil);
            if(cyndaquil.getHP()== 0){
                break;
            }
            if(turnCount % 3 == 0){
                totodile.charge();
            }
            if(turnCount % 7 == 0){
                cyndaquil.special();
            }
            if(turnCount % 10 == 0){
                totodile.special();
            }
            turnCount++;
        }
    }
}
