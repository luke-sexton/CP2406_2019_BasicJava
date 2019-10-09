package week12;

import javax.swing.*;
import java.awt.*;

public class JBorderPanel extends JPanel {
    private JLabel nameLabel = new JLabel("Luke Sexton");
    private int x, y, width, height;

    public JBorderPanel() {
        setBackground(Color.WHITE);
        setLayout(new GridBagLayout());
        add(nameLabel);
    }

    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        width = nameLabel.getWidth() + 10;
        height = nameLabel.getHeight() + 10;

        for (x = nameLabel.getX() - 5, y = nameLabel.getY() - 5; height <= 60; width += 10, height += 10, x -= 5, y -= 5) {
            graphics.drawRect(x, y, width, height);
        }
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new JBorderPanel());
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
