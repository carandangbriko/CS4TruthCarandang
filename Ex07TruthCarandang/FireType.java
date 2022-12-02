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
public class FireType extends Monster{
    public FireType(String n, int m, int base){
        super(n, "fire", "grass", "water", m, base);
        setAtk(base * 13 / 10);
        setDef(base * 7 / 10);
    }
    @Override
    public void special(){
        setAtk(getAtk() + 2);
        setHP(getHP() - getMaxHP() * 10/100);
        System.out.println(getName() + " used Overheat!"); //this isnt what overheat does ingame
        System.out.println(getName() + "'s attack went up by 2! Attack is now " + getAtk() + ".");
        System.out.println(getName() + " lost HP! HP is now " + getHP() + ".");
    }
}
