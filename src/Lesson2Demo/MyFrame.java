package Lesson2Demo;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;

    public MyFrame(){
        setTitle ("My First Subclass");
        setSize (FRAME_WIDTH, FRAME_HEIGHT);
        setLocation (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setBackground(Color.cyan);
    }
}

