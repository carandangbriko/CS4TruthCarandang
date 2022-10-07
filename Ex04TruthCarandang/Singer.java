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
public class Singer {
    private String name;
    private int noOfPerformances;
    private double earnings;
    private Song favoriteSong;
    private static int totalPerformances = 0;
    
    public Singer(String n, int p, double e, Song s){
        this.name = n;
        this.noOfPerformances = p;
        this.earnings = e;
        this.favoriteSong = s;
        this.totalPerformances += p;
    }
    
    public String getSingerName(){
        return name;
    }
    
    public int getSingerPerformances(){
        return noOfPerformances;
    }
    
    public double getEarnings(){
        return earnings;
    }
    
    public int getTotalPerformances(){
        return totalPerformances;
    }
    
    public void addEarnings(int earned){
        earnings += earned;
    }
    
    public void addPerformances(){
        noOfPerformances++;
        totalPerformances++;
    }
    
    public void performForAudience(int n){
        noOfPerformances++;
        totalPerformances++;
        earnings += 100 * n;
        System.out.printf("Singer %s performed for an audience of %d people. They have now performed %d times and have %.2f in earnings.%n", name, n, noOfPerformances, earnings);
    }
    
    public void performForAudience(Singer s, int n){
        noOfPerformances++;
        totalPerformances++;
        earnings += 100 * n / 2;
        s.addPerformances();
        s.addEarnings(100 * n / 2);
        System.out.printf("Singer %s performed with guest performer %s for an audience of %d people.%n%s has now performed %d times, while %s has now performed %d times.%n%s now has %.2f in earnings, while %s now has %.2f in earnings.%n", name, s.getSingerName(), n, name, noOfPerformances, s.getSingerName(), s.getSingerPerformances(), name, earnings, s.getSingerName(), s.getEarnings());
    }
    
    public void changeFavSong(Song s){
        favoriteSong = s;
        System.out.printf("%s's new favorite song is %s.%n", name, favoriteSong.getTitle());
    }
}
