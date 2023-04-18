package Lesson3Demo.GUIDemo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame("My First JFrame");
        myFrame.setSize(900,700);
        myFrame.getContentPane().setBackground(Color.YELLOW);

        JLabel myLabel = new JLabel();
        myLabel.setText("My First JLabel");
        
        myFrame.add(myLabel);

        myFrame.setVisible(true);

    }
}
