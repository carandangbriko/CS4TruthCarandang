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
public class Singer {
    private String name;
    private int noOfPerformances;
    private double earnings;
    private Song favoriteSong;
    
    public Singer(String n, int p, double e, Song s){
        name = n;
        noOfPerformances = p;
        earnings = e;
        favoriteSong = s;
    }
    
    public void performForAudience(int n){
        noOfPerformances += 1;
        earnings += 100 * n;
        System.out.printf("Singer %s performed for an audience of %d people. They have now performed %d times and have %f in earnings.%n", name, n, noOfPerformances, earnings);
    }
    
    public void changeFavSong(Song s){
        favoriteSong = s;
        System.out.printf("%s's new favorite song is %s.", name, favoriteSong.getTitle());
    }
}
