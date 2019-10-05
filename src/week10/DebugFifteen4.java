package week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DebugFifteen4 extends JFrame implements ActionListener {
    private JMenuBar mainBar = new JMenuBar();
    private JMenu menu1 = new JMenu("File");
    private JMenu menu2 = new JMenu("Symbols");
    private JMenu menu3 = new JMenu("Cities");
    private JMenuItem exit = new JMenuItem("Exit");
    private JMenuItem animal = new JMenuItem("Animal");
    private JMenuItem song = new JMenuItem("Song");
    private JMenuItem flower = new JMenuItem("Flower");
    private JMenuItem milwaukee = new JMenuItem("Milwaukee");
    private JMenuItem madison = new JMenuItem("Madison");
    private JLabel label1 = new JLabel(" Wisconsin Facts ");
    private JLabel label2 = new JLabel();

    public DebugFifteen4() {
        setTitle("Facts about Wisconsin");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setJMenuBar(mainBar);
        mainBar.add(menu1);
        mainBar.add(menu2);
        mainBar.add(menu3);
        menu1.add(exit);
        menu2.add(animal);
        menu2.add(song);
        menu2.add(flower);
        menu3.add(milwaukee);
        menu3.add(madison);
        exit.addActionListener(this);
        animal.addActionListener(this);
        song.addActionListener(this);
        flower.addActionListener(this);
        milwaukee.addActionListener(this);
        madison.addActionListener(this);
        add(label1);
        label1.setFont(new Font("Arial", Font.BOLD, 14));
        add(label2);
        label2.setFont(new Font("Arial", Font.PLAIN, 14));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        String text = "  ";
        if (source == exit) {
            System.exit(0);
        } else if (source == animal) {
            text = "The state animal is badger";
        } else if (source == song) {
            text = "The state song is On Wisconsin!";
        } else if (source == flower) {
            text = "The state flower is wood violet";
        } else if (source == milwaukee) {
            text = "Milwaukee is the largest city";
        } else {
            text = "Madison is the capital";
        }
        label2.setText(text);
        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        DebugFifteen4 frame = new DebugFifteen4();
        final int WIDTH = 250;
        final int HEIGHT = 200;
        frame.setSize(WIDTH, HEIGHT);
        frame.setVisible(true);
    }
}
