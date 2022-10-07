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
public class Song {
    private String title;
    private String genre;
    private int listeners;
    private int bpm;
    
    public Song(String t, String g, int l, int b){
        this.title = t;
        this.genre = g;
        this.listeners = l;
        this.bpm = b;
    }
    
    public String getTitle(){
        return title;
    }
}
