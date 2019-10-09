package week12;// This program shows a customer
// what a shirt looks like in different colors

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DebugSixteen4 extends JPanel implements ActionListener {
    private JLabel header = new JLabel("Outfit planner");
    private JButton changeButton = new JButton("Change clothes");
    private int counter = 0;
    private int[] xTop = {20, 40, 50, 60, 80, 75, 62, 66, 40, 38, 25, 20};
    private int[] yTop = {142, 130, 138, 130, 138, 148, 142, 160, 160, 142, 148, 142};
    private Color[] colors = {Color.RED, Color.PINK, Color.YELLOW, Color.GREEN, Color.CYAN};
    private Font font = new Font("Arial", Font.BOLD, 14);
    private final double price = 39.95;
    private final int X = 100;

    private final int GAP = 20;
    private int cycle = 0;

    public DebugSixteen4() {
        setBackground(Color.WHITE);
        setLayout(new FlowLayout());
        add(header);
        add(changeButton);
        changeButton.addActionListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int y = 80;
        g.setFont(font);
        g.setColor(colors[cycle]);
        g.fillPolygon(xTop, yTop, 12);
        g.setColor(Color.BLACK);
        g.drawString("Just look at the colors", X, y += GAP);
        g.drawString("in which you can buy", X, y += GAP);
        g.drawString("this beautiful shirt", X, y += GAP);
        g.drawString("Only $" + price, X, y += GAP);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ++counter;
        cycle = counter % colors.length;
        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new DebugSixteen4());
        frame.setSize(350, 240);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}