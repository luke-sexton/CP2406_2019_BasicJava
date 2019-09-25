package week9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JBookQuote2 extends JBookQuote implements ActionListener {


    JBookQuote2() {
        bookTitleButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        bookTitleButton.setVisible(false);
        add(bookTitleLabel);
    }

    public static void main(String[] args) {
        JBookQuote2 frame = new JBookQuote2();
    }
}
