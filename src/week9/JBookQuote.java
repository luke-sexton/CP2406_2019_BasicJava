package week9;

import javax.swing.*;
import java.awt.*;

public class JBookQuote extends JFrame {
    private final int WIDTH = 400;
    private final int HEIGHT = 300;
    private JLabel quote = new JLabel("This is a line from my favourite book.", SwingConstants.CENTER);
    protected JLabel bookTitleLabel = new JLabel("Book Title: My Favourite Book");
    protected JButton bookTitleButton = new JButton("Show Book Title");

    public JBookQuote() {
        super("JBookQuote");
        setDefaultLookAndFeelDecorated(true);
        setLayout(new FlowLayout());
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(quote);
        add(bookTitleButton);
        setVisible(true);
    }

    public static void main(String[] args) {
        JBookQuote frame = new JBookQuote();
    }

}
