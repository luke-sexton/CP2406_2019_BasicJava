package week12;// The panel should change color when user's mouse enters or exits it
// A circle should appear wherever the user clicks
// The circle becomes smaller when the user double-clicks

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DebugSixteen2 extends JPanel implements MouseListener {
    private int x, y;
    private int size = 20;

    public DebugSixteen2() {
        addMouseListener(this);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new DebugSixteen2());
        frame.setSize(250, 150);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() == 2) {
            size -= 2;
        }
        revalidate();
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        setBackground(Color.ORANGE);
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(x - size, y - size, size * 2, size * 2);
    }
}