package week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JEmail2 extends JFrame implements ActionListener {
    private Container container;

    private String toTextAreaHeader = "To: ";
    private String subjectTextAreaHeader = "Subject: ";
    private String messageTextAreaHeader = "Message: ";

    private JTextArea toTextArea = new JTextArea(toTextAreaHeader, 1, 1);
    private JTextArea subjectTextArea = new JTextArea(subjectTextAreaHeader, 1, 1);
    private JTextArea messageTextArea = new JTextArea(messageTextAreaHeader, 25, 1);
    private JScrollPane scrollTextArea = new JScrollPane(messageTextArea);

    private JPanel buttonPanel = new JPanel();
    private JButton sendButton = new JButton("Send Email");
    private JButton clearButton = new JButton("Clear");

    public JEmail2() {
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

        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(sendButton);
        buttonPanel.add(clearButton);
        sendButton.addActionListener(this);
        clearButton.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source.equals(sendButton)) {
            String message = "\nMail has been sent!";
            messageTextArea.append(message);
        } else {
            toTextArea.setText(toTextAreaHeader);
            subjectTextArea.setText(subjectTextAreaHeader);
            messageTextArea.setText(messageTextAreaHeader);
        }
        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        JEmail2 frame = new JEmail2();
    }
}
