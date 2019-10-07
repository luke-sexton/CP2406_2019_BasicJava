package week10;

import javax.swing.*;
import java.awt.*;

public class JEmail extends JFrame {
    private Container container;
    private JTextArea toTextArea = new JTextArea("To: ", 1, 1);
    private JTextArea subjectTextArea = new JTextArea("Subject: ", 1, 1);
    private JTextArea messageTextArea = new JTextArea("Message: ", 25, 1);
    private JScrollPane scrollTextArea = new JScrollPane(messageTextArea);


    public JEmail() {
        container = this.getContentPane();
        setLayout(new BoxLayout(container, BoxLayout.PAGE_AXIS));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);

        // Restrict following text areas to one line
        toTextArea.getDocument().putProperty("filterNewlines", Boolean.TRUE);
        subjectTextArea.getDocument().putProperty("filterNewlines", Boolean.TRUE);

        add(toTextArea);
        add(subjectTextArea);
        add(scrollTextArea);
        setVisible(true);
    }

    public static void main(String[] args) {
        JEmail frame = new JEmail();
    }
}
