package week12;


import javax.swing.*;
import java.awt.*;

public class JNestedBoxesPanel extends JPanel {
    private int corner, line;


    public JNestedBoxesPanel() {
        setBackground(Color.WHITE);
    }

    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.setColor(Color.BLACK);
        for (corner = 350, line = 0; line < 360; line += 40, corner -= 20) {
            graphics.drawRect(corner, corner, line, line);
        }
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new JNestedBoxesPanel());
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
