package week10;

import javax.swing.*;
import java.awt.*;

public class JFlexiblePanel extends JPanel {
    private JLabel label = new JLabel();
    private int fontSize = 16;

    public JFlexiblePanel(Color backgroundColour, Color foregroundColour, String fontName, String sentence) {
        setBackground(backgroundColour);
//        setAlignmentX(CENTER_ALIGNMENT);
        add(label);
        label.setForeground(foregroundColour);
        label.setFont(new Font(fontName, Font.PLAIN, 36));
        label.setText(sentence);

        setVisible(true);

    }
}
