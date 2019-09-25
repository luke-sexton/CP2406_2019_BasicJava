package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Objects;

public class JPizza extends JFrame implements ItemListener {
    private final int WIDTH = 400;
    private final int HEIGHT = 300;
    private String[] sizes = {"Sizes", "S", "M", "L", "XL"};
    private String[] toppings = {"Toppings", "Cheese", "Olives", "Jelly", "Sugar", "Chocolate"};
    private JComboBox<String> sizesComboBox = new JComboBox<>(sizes);
    private JComboBox<String> toppingsComboBox = new JComboBox<>(toppings);

    private JLabel statusLabel = new JLabel("");


    public JPizza() {
        super("Pizza");
        setDefaultLookAndFeelDecorated(true);
        setLayout(new FlowLayout());
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel jPanel = new JPanel();

        add(jPanel);
        jPanel.add(sizesComboBox);
        jPanel.add(toppingsComboBox);
        jPanel.add(statusLabel);
        sizesComboBox.addItemListener(this);
        toppingsComboBox.addItemListener(this);
        setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        int s = 7, m = 9, l = 11, xl = 14;
        int toppingPrice = 1;
        int currentPrice;
        if (Objects.equals(sizesComboBox.getSelectedItem(), "S")) {
            currentPrice = s;
        } else if (Objects.equals(sizesComboBox.getSelectedItem(), "M")) {
            currentPrice = m;
        } else if (Objects.equals(sizesComboBox.getSelectedItem(), "L")) {
            currentPrice = l;
        } else {
            currentPrice = xl;
        }

        if (Objects.equals(toppingsComboBox.getSelectedItem(), "Olives") ||
                Objects.equals(toppingsComboBox.getSelectedItem(), "Jelly") ||
                Objects.equals(toppingsComboBox.getSelectedItem(), "Sugar") ||
                Objects.equals(toppingsComboBox.getSelectedItem(), "Chocolate")) {
            currentPrice += toppingPrice;
        }
        String totalPrice = "Total price is " + currentPrice;
        statusLabel.setText(totalPrice);
        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        JPizza frame = new JPizza();
    }
}
