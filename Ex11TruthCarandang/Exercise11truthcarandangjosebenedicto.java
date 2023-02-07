/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise11truthcarandangjosebenedicto;

import java.awt.*;
import javax.swing.*;
/**
 *
 * @author TRUTH
 */
public class Exercise11truthcarandangjosebenedicto extends JFrame {
    
    public static void main(String[] args) {
        GUITemp frame = new GUITemp();
        Subject math = new Subject("Math", "math.png", 4, 1.75);
        Subject bio = new Subject("Biology", "biology.png", 3, 2.0);
        Subject chem = new Subject("Chemistry", "chemistry.png", 3, 1.5);
        Subject physics = new Subject("Physics", "physics.png", 3, 1.75);
        Subject cs = new Subject("CS", "computer science.png", 1, 1.5);
        Subject displayedSubject = cs;
        frame.setSubject(displayedSubject);
    }
    
}
