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
public class GrassType extends Monster{
    public GrassType(String n, int m, int base){
        super(n, "grass", "water", "fire", m, base);
    }
    @Override
    public void special(){
        setHP(getHP() + getMaxHP() * 20/100);
        System.out.println(getName() + " used Synthesis!"); //this IS what synthesis does ingame
        System.out.println(getName() + " gained HP!");
    }
    @Override
    public void rest(){
        setHP(getHP() + getMaxHP() * 1/2);
    }
}