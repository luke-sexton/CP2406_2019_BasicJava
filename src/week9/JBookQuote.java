package week9;

import javax.swing.*;

public class JBookQuote extends JFrame {
    final int WIDTH = 200;
    final int HEIGHT = 200;
    JLabel quote = new JLabel("This is a line from my favourite book.", SwingConstants.CENTER);

    public JBookQuote() {
        super("JBookQuote");
        setDefaultLookAndFeelDecorated(true);
        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(quote);
    }
    public static void main(String[] args) {
        JBookQuote frame = new JBookQuote();
    }

}
