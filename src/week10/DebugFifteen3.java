package week10;// Lets user type keys
// Displays each key typed

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class DebugFifteen3 extends JFrame implements KeyListener {
    private Container con;
    private GridLayout grid = new GridLayout(2, 1);
    private JLabel label = new JLabel("Key Typed:");
    private JTextArea textArea = new JTextArea(4, 25);

    public DebugFifteen3() {
        con = this.getContentPane();
        setTitle("Debug Key Frame");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(grid);
        con.add(textArea);
        con.add(label);
        textArea.addKeyListener(this);
        setVisible(true);
    }

   @Override
   public void keyTyped(KeyEvent e) {
      char c = e.getKeyChar();
      label.setText("Key Typed: " + c);
   }

   @Override
   public void keyPressed(KeyEvent e) {

   }

   @Override
    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {
        DebugFifteen3 kFrame = new DebugFifteen3();
    }
}


