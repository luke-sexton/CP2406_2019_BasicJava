package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameDisableButton extends JFrame implements ActionListener {
    private final int WIDTH = 400;
    private final int HEIGHT = 300;
    private int clickCount = 0;

    private JButton button = new JButton("Click Me");
    private JLabel label = new JLabel(  "That's Enough!");


    public JFrameDisableButton() {
        super("Disable Button");
        setDefaultLookAndFeelDecorated(true);
        setLayout(new FlowLayout());
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(button);
        setVisible(true);

        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        clickCount += 1;
        if (clickCount == 8) {
            button.setEnabled(false);
            add(label);

            revalidate();
            repaint();
        }
    }

    public static void main(String[] args) {
        JFrameDisableButton frame = new JFrameDisableButton();
    }
}
