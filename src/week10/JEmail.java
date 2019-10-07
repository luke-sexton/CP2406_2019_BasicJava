package week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JEmail extends JFrame implements ActionListener {
    private Container container;

    private JTextArea toTextArea = new JTextArea("To: ", 1, 1);
    private JTextArea subjectTextArea = new JTextArea("Subject: ", 1, 1);
    private JTextArea messageTextArea = new JTextArea("Message: ", 25, 1);
    private JScrollPane scrollTextArea = new JScrollPane(messageTextArea);

    private JPanel buttonPanel = new JPanel();
    private JButton sendButton = new JButton("Send Email");


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
        add(buttonPanel, Component.CENTER_ALIGNMENT);

        buttonPanel.add(sendButton);
        sendButton.addActionListener(this);

        setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        String message = "\nMail has been sent!";
        messageTextArea.append(message);
        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        JEmail frame = new JEmail();
    }
}
