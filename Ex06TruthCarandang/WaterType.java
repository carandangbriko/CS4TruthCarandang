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
public class WaterType extends Monster{
    public WaterType(String n, int m, int base){
        super(n, "water", "fire", "grass", m, base);
        setAtk(base * 7 / 10);
        setDef(base * 13 / 10);
    }
    @Override
    public void special(){
        setDef(getDef() + 2);
        setHP(getHP() - getMaxHP() * 10/100);
        System.out.println(getName() + " used Withdraw!"); //this isnt what withdraw does ingame
        System.out.println(getName() + "'s defense went up by 2! Defense is now " + getDef() + ".");
        System.out.println(getName() + " lost HP! HP is now " + getHP() + ".");
    }
}
