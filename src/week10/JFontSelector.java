package week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFontSelector extends JFrame implements ActionListener {
    private JPanel buttonPanel = new JPanel(new GridLayout(4, 2));

    private JButton arialButton = new JButton("Arial");
    private JButton verdanaButton = new JButton("Verdana");
    private JButton helveticaButton = new JButton("Helvetica");
    private JButton serifButton = new JButton("Serif");
    private JButton courierButton = new JButton("Courier");
    private JButton increaseSizeButton = new JButton(("Increase Font Size"));
    private JButton decreaseSizeButton = new JButton(("Decrease Font Size"));

    private int fontSize = 12;
    private Font arialFont = new Font("Arial", Font.PLAIN, fontSize);
    private Font verdanaFont = new Font("Verdana", Font.PLAIN, fontSize);
    private Font helveticaFont = new Font("Helvetica", Font.PLAIN, fontSize);
    private Font serifFont = new Font("Serif", Font.PLAIN, fontSize);
    private Font courierFont = new Font("Courier", Font.PLAIN, fontSize);

    private JButton[] buttons = {arialButton, verdanaButton, helveticaButton,
            serifButton, courierButton, increaseSizeButton, decreaseSizeButton};
    private Font[] fonts = {arialFont, verdanaFont, helveticaFont, serifFont, courierFont};


    public JFontSelector() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

        add(buttonPanel);

        for (JButton button : buttons) {
            for (Font font : fonts) {
                buttonPanel.add(button).setFont(font);

            }
            button.addActionListener(this);
        }
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (buttons[5].equals(source)) { // increase font size
            fontSize += 2;
            for (Font font : fonts) {
                for (int i = 0; i < buttons.length - 2; i++) {
                    Font tempFont = font.deriveFont(Font.PLAIN, fontSize);
                    buttons[i].setFont(tempFont);
                }
            }
        } else if (buttons[6].equals(source)) { // decrease font size
            fontSize -= 2;
            for (Font font : fonts) {
                for (int i = 0; i < buttons.length - 2; i++) {
                    Font tempFont = font.deriveFont(Font.PLAIN, fontSize);
                    buttons[i].setFont(tempFont);
                }
            }
        }
        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        JFontSelector frame = new JFontSelector();
    }
}
