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
public class GUITemp extends JFrame {
    private JLabel subject = new JLabel();
    private JLabel units = new JLabel();
    private JLabel grade = new JLabel();
    JButton next = new JButton("Next");
    
    public GUITemp(){
        this.setTitle("a");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1280, 720);
        this.setLayout(new FlowLayout());
        this.add(subject);
        this.add(units);
        this.add(grade);
        this.add(next);
        subject.setSize(200,200);
        this.setVisible(true);
    }
    
    public void setSubject(Subject s){
        ImageIcon image = null;
        image = new ImageIcon(Exercise11truthcarandangjosebenedicto.class.getResource(s.getImgFileName()));
        subject.setIcon(image);
        subject.setText(s.getName() + " |");
        units.setText(Double.toString(s.getUnits()) + " units |");
        grade.setText("Grade: " + Double.toString(s.getGrade()));
    }
}
