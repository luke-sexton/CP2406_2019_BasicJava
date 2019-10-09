package week12;

import javax.swing.*;
import java.awt.*;

public class JNestedCirclesPanel extends JPanel {
        private int radius, corner;

    public JNestedCirclesPanel() {
        setBackground(Color.WHITE);
    }

    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.setColor(Color.BLACK);
        for (corner = 325, radius = 50; radius < 750; radius += 50, corner -= 25) {
            graphics.drawOval(corner, corner, radius, radius);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new JNestedCirclesPanel());
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
