package week10;

import javax.swing.*;
import java.awt.*;

public class JPanelDemo extends JFrame {
    private GridLayout grid = new GridLayout(2, 2);
    private JFlexiblePanel panelOne = new JFlexiblePanel(Color.WHITE, Color.ORANGE,
            "Arial", "Hello, I am Arial");
    private JFlexiblePanel panelTwo = new JFlexiblePanel(Color.PINK, Color.BLUE,
            "Serif.plain", "Hello, I am Serif");
    private JFlexiblePanel panelThree = new JFlexiblePanel(Color.RED, Color.GREEN,
            "Calibri", "Hello, I am Calibri");
    private JFlexiblePanel panelFour = new JFlexiblePanel(Color.MAGENTA, Color.YELLOW,
            "Courier New", "Hello, I am Courier");

    public JPanelDemo() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 800);
        setLayout(grid);

        add(panelOne);
        add(panelTwo);
        add(panelThree);
        add(panelFour);

        setVisible(true);
    }

    public static void main(String[] args) {
        JPanelDemo frame = new JPanelDemo();
    }
}
