package ex09truthcarandang;

import java.util.*;

public class Trainer {
    private String name;
    private Monster activeMonster;
    private ArrayList<Monster> team;

    public Trainer(String n){
        this.name = n;
        this.activeMonster = null;
        this.team = new ArrayList<>();
    }
    
    public String getName() {
        return name;
    }
    public Monster getActiveMonster(){
        return activeMonster;
    }
    public ArrayList<Monster> getTeam(){
        return team;
    }

    public void capture(Monster m){
        if(m.getHP() < m.getMaxHP()*0.2){
            team.add(m);
            System.out.println(this.getName() + " caught " + m.getName() + ".");
        }
        else{
            System.out.println(this.getName() + " failed to catch " + m.getName() + ".");
        }
    }
    public void battle(Monster m){
        activeMonster.attack(m);
    }
    public void battle(Trainer t){
        activeMonster.attack(t.getActiveMonster());
    }
    public void sureCapture(Monster m) throws AlreadyCapturedException{
        if(team.contains(m)){
            throw new AlreadyCapturedException(m.getName() + " is already in the team.");
        }
        else{
            team.add(m);
            System.out.printf("%s was successfully captured.", m.getName());
        }
    }
    public void release(Monster m){
        team.remove(m);
        System.out.printf("%s was released from the team.", m.getName());
    }
}
