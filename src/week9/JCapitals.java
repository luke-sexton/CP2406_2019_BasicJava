package week9;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class JCapitals extends JFrame implements ListSelectionListener {
    private final int WIDTH = 400;
    private final int HEIGHT = 300;
    private String[] countries = {"America", "Australia", "Brazil", "Canada", "France", "Hungary", "Malaysia"};
    private JList<String> countryListBox = new JList<>(countries);
    private Map<String, String> countryCapitalMap = new HashMap<>();
    private JLabel selectionLabel = new JLabel();


    public JCapitals() {
        super("Capitals");
        setDefaultLookAndFeelDecorated(true);
        setLayout(new FlowLayout());
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel jPanel = new JPanel();

        add(jPanel);
        jPanel.add(countryListBox);
        countryListBox.addListSelectionListener(this);
        setVisible(true);
    }

    @Override
    public void valueChanged(ListSelectionEvent event) {
        countryCapitalMap.put("America", "Washington, D.C.");
        countryCapitalMap.put("Australia", "Canberra");
        countryCapitalMap.put("Brazil", "Brasilia");
        countryCapitalMap.put("Canada", "Ottawa");
        countryCapitalMap.put("France", "Paris");
        countryCapitalMap.put("Hungary", "Budapest");
        countryCapitalMap.put("Malaysia", "Kuala Lumpur");

        if (countryCapitalMap.containsKey(countryListBox.getSelectedValue())) {
            selectionLabel.setText("Country Selected: " + countryListBox.getSelectedValue() +
                    " -- Capital City: " + countryCapitalMap.get(countryListBox.getSelectedValue()));
            add(selectionLabel, FlowLayout.CENTER);
        }
        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        JCapitals frame = new JCapitals();
    }
}
