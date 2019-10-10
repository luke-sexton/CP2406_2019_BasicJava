package week12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JUpsideDownPanel extends JPanel implements ActionListener {
    private String phrase = "Do I look right to you?";
    private JButton button = new JButton("Click Me!");
    private boolean upRight = true;

    public JUpsideDownPanel() {
        setBackground(Color.WHITE);
        add(button);
        button.addActionListener(this);
    }

    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        final int INVERSE = -1;
        final int GAP = 100;
        int x = button.getX();
        int y = button.getY() + GAP;
        int fontSize = 36;

        if (upRight) {
            graphics.setFont(new Font("Arial", Font.PLAIN, fontSize));
            graphics.drawString(phrase, x, y);
        } else {
            graphics.setFont(new Font("Arial", Font.PLAIN, fontSize * INVERSE));
            graphics.drawString(phrase, x + x, y);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (upRight) {
            upRight = false;
        } else {
            upRight = true;
        }
        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(new JUpsideDownPanel());
        frame.setSize(800, 800);
    }
}
