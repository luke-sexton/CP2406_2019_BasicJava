package week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMovieFrame extends JFrame implements ActionListener {
    private Container container;
    private JLabel movieLabel = new JLabel("");
    private JButton northButton = new JButton("North to Alaska");
    private JButton eastButton = new JButton("Heroes of the East");
    private JButton southButton = new JButton("Song of the South");
    private JButton westButton = new JButton("West of Thunder");
    private JButton centerButton = new JButton("Center Stage");


    public JMovieFrame() {
        container = this.getContentPane();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLayout(new BorderLayout());

        container.add(northButton, BorderLayout.NORTH);
        container.add(eastButton, BorderLayout.EAST);
        container.add(southButton, BorderLayout.SOUTH);
        container.add(westButton, BorderLayout.WEST);
        container.add(centerButton, BorderLayout.CENTER);

        northButton.addActionListener(this);
        eastButton.addActionListener(this);
        southButton.addActionListener(this);
        westButton.addActionListener(this);
        centerButton.addActionListener(this);

        add(movieLabel);
        movieLabel.setHorizontalAlignment(JLabel.CENTER);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        StringBuilder details = new StringBuilder("Year Released: ");
        String year = "", actorLabel = " Actor: ", actorName = "" ;

        if (northButton.equals(source)) {
            year = "1991";
            actorName = "Whitey Willaby";
        } else if (eastButton.equals(source)) {
            year = "1992";
            actorName = "James Jimmy";
        } else if (southButton.equals(source)) {
            year = "1993";
            actorName = "Jennifer Jane";
        } else if (westButton.equals(source)) {
            year = "1994";
            actorName = "Molly Moseby";
        } else if (centerButton.equals(source)) {
            year = "1995";
            actorName = "Benjamin Bingo";
        }
        details.append(year).append(actorLabel).append(actorName);
        movieLabel.setText(String.valueOf(details));
        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        JMovieFrame frame = new JMovieFrame();
    }
}
