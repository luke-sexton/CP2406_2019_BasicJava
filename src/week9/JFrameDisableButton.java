package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameDisableButton extends JFrame implements ActionListener {
    private final int WIDTH = 400;
    private final int HEIGHT = 300;
    JButton button = new JButton("Click Me");

    public JFrameDisableButton() {
        super("Disable Button");
        setDefaultLookAndFeelDecorated(true);
        setLayout(new FlowLayout());
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        add(button);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setEnabled(false);
    }

    public static void main(String[] args) {
        JFrameDisableButton frame = new JFrameDisableButton();
    }
}
