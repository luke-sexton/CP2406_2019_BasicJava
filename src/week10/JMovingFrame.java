package week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMovingFrame extends JFrame implements ActionListener {
    private Container container;
    private GridLayout grid = new GridLayout(2, 2);

    private JPanel panelView = new JPanel();
    private JPanel topLeftPanel = new JPanel();
    private JPanel topRightPanel = new JPanel();
    private JPanel bottomLeftPanel = new JPanel();
    private JPanel bottomRightPanel = new JPanel();

    private JButton button = new JButton("Click Me!");
    private JLabel label = new JLabel("I'm over here!");

    private int index = 1;


    public JMovingFrame() {
        container = this.getContentPane();

        setLayout(new BoxLayout(container, BoxLayout.PAGE_AXIS));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);

        add(panelView);
        panelView.setLayout(grid);
        panelView.add(topLeftPanel);
        panelView.add(topRightPanel);
        panelView.add(bottomLeftPanel);
        panelView.add(bottomRightPanel);

        // Center JLabel in each panel
        topLeftPanel.setLayout(new GridBagLayout());
        topRightPanel.setLayout(new GridBagLayout());
        bottomLeftPanel.setLayout(new GridBagLayout());
        bottomRightPanel.setLayout(new GridBagLayout());

        add(button);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Move JLabel clockwise
        switch (index) {
            case 1:
                bottomRightPanel.remove(label);
                topLeftPanel.add(label);
                break;
            case 2:
                topLeftPanel.remove(label);
                topRightPanel.add(label);
                break;
            case 3:
                topRightPanel.remove(label);
                bottomLeftPanel.add(label);
                break;
            case 4:
                bottomLeftPanel.remove(label);
                bottomRightPanel.add(label);
                index = 0;
        }
        index += 1;
        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        JMovingFrame frame = new JMovingFrame();
    }
}
