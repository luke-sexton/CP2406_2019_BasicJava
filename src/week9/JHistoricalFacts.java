package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JHistoricalFacts extends JFrame implements ActionListener {
    private final int WIDTH = 400;
    private final int HEIGHT = 300;
    private JLabel label = new JLabel("");
    private JButton button = new JButton("Press Me");

    private String[] facts = {"Turkeys Were Once Worshipped Like Gods",
            "Paul Revere Never Actually Shouted, “The British Are Coming!”",
            "The Olympics Used to Award Medals for Art.",
            "One Time, 100 Imposters Claimed to Be Marie Antoinette’s Dead Son",
            "Napoleon Was Once Attacked By a Horde of Bunnies"};
    private int index = 0;


    public JHistoricalFacts() {
        super("Historical Facts");
        setDefaultLookAndFeelDecorated(true);
        setLayout(new FlowLayout());
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(label);
        add(button);
        setVisible(true);

        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (index) {
            case 0:
                label.setText(facts[0]);
                break;
            case 1:
                label.setText(facts[1]);
                break;
            case 2:
                label.setText(facts[2]);
                break;
            case 3:
                label.setText(facts[3]);
                break;
            case 4:
                label.setText(facts[4]);
        }
        if (index == facts.length - 1) {
            index = 0;
        } else {
            index += 1;
        }
    }

    public static void main(String[] args) {
        JHistoricalFacts frame = new JHistoricalFacts();
    }
}
