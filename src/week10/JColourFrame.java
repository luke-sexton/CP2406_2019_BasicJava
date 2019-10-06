package week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JColourFrame extends JFrame implements ActionListener {
    private JButton centerButton = new JButton("Click Me!");
    private JPanel northPanel = new JPanel();
    private JPanel eastPanel = new JPanel();
    private JPanel southPanel = new JPanel();
    private JPanel westPanel = new JPanel();

    private JPanel[] panels = {northPanel, eastPanel, southPanel, westPanel};
    private Color[] colours = {Color.BLACK, Color.ORANGE, Color.BLUE, Color.RED};

    private int index = 0;



    public JColourFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLayout(new BorderLayout());

        add(centerButton, BorderLayout.CENTER);
        add(panels[0], BorderLayout.NORTH);
        add(panels[1], BorderLayout.EAST);
        add(panels[2], BorderLayout.SOUTH);
        add(panels[3], BorderLayout.WEST);


        centerButton.addActionListener(this);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        switch (index) {
            case 0:
                panels[index].setBackground(colours[index]);
                panels[panels.length - 1].setBackground(Color.WHITE);
                break;
            case 1:
                panels[1].setBackground(colours[1]);
                panels[0].setBackground(Color.WHITE);
                break;
            case 2:
                panels[2].setBackground(colours[2]);
                panels[1].setBackground(Color.WHITE);
                break;
            case 3:
                panels[3].setBackground(colours[3]);
                panels[2].setBackground(Color.WHITE);
                index = -1;
                break;
        }
        index += 1;
        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        JColourFrame frame = new JColourFrame();
    }
}
