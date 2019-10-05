package week10;// Demonstrates layout positions
// using BorderLayout

import javax.swing.*;
import java.awt.*;

public class DebugFifteen2 extends JFrame {
    private JButton nb = new JButton("Left    ");
    private JButton sb = new JButton("Down  ");
    private JButton eb = new JButton("Right ");
    private JButton wb = new JButton("Center  ");
    private JButton cb = new JButton("Up");
    private Container con;

    public DebugFifteen2() {
        con = this.getContentPane();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLayout(new BorderLayout());

        con.add(nb, BorderLayout.WEST);
        con.add(sb, BorderLayout.SOUTH);
        con.add(eb, BorderLayout.EAST);
        con.add(wb, BorderLayout.CENTER);
        con.add(cb, BorderLayout.NORTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        DebugFifteen2 f = new DebugFifteen2();
    }
}