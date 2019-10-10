package week12;

import javax.swing.*;
import java.awt.*;


public class JFontSizesPanel extends JPanel {
    private int[] sizes = {6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    private String phrase = "I am getting bigger!";

    public JFontSizesPanel() {
        setBackground(Color.WHITE);
    }

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        final int GAP = 30;
        int x = 200;
        int y = 200;

        for (int size : sizes) {
            graphics.setFont(new Font("Arial", Font.PLAIN, size));
            graphics.drawString(phrase, x, y);
            y += GAP;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(new JFontSizesPanel());
        frame.setSize(800, 800);
    }
}
