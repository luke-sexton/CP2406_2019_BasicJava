package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Objects;

public class JVacationRental extends JFrame implements ActionListener, ItemListener {
    private final int WIDTH = 400;
    private final int HEIGHT = 300;
    private int currentPrice = 0;
    private String totalPrice = "";

    private JPanel jPanel = new JPanel();
    private JLabel statusLabel = new JLabel("");

    private JRadioButton parksideButton = new JRadioButton("Parkside");
    private JRadioButton poolsideButton = new JRadioButton("Poolside");
    private JRadioButton lakesideButton = new JRadioButton("Lakeside");

    private String[] bedroomOptions = {"Bedroom Options", "1", "2", "3"};
    private String[] mealOptions = {"Meal Included", "Yes", "No"};
    private JComboBox<String> dropDownBedrooms = new JComboBox<>(bedroomOptions);
    private JComboBox<String> dropDownMeals = new JComboBox<>(mealOptions);
    private ButtonGroup locationButtonGroup = new ButtonGroup();

    public JVacationRental() {
        super("Vacation Rental");
        setDefaultLookAndFeelDecorated(true);
        setLayout(new FlowLayout());
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(jPanel);

        locationButtonGroup.add(parksideButton);
        locationButtonGroup.add(poolsideButton);
        locationButtonGroup.add(lakesideButton);

        jPanel.add(parksideButton);
        jPanel.add(poolsideButton);
        jPanel.add(lakesideButton);
        jPanel.add(dropDownBedrooms);
        jPanel.add(dropDownMeals);
        jPanel.add(statusLabel);

        parksideButton.addActionListener(this);
        poolsideButton.addActionListener(this);
        lakesideButton.addActionListener(this);

        dropDownMeals.addItemListener(this);
        dropDownBedrooms.addItemListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (parksideButton.isSelected()) {
            currentPrice = 600;
        } else if (poolsideButton.isSelected()) {
            currentPrice = 750;
        } else {
            currentPrice = 825;
        }
        totalPrice = "Total price is " + currentPrice;
        statusLabel.setText(totalPrice);
        revalidate();
        repaint();
    }

    @Override
    public void itemStateChanged(ItemEvent event) {
        int parksidePrice = 600;
        int poolsidePrice = 750;
        int lakesidePrice = 825;
        int perRoomPrice = 75;
        int mealIncludedPrice = 200;

        if (Objects.equals(dropDownBedrooms.getSelectedItem(), "2")) {
            if (parksideButton.isSelected()) {
                currentPrice = parksidePrice + perRoomPrice;
            } else if (poolsideButton.isSelected()) {
                currentPrice = poolsidePrice + perRoomPrice;
            } else {
                currentPrice = lakesidePrice + perRoomPrice;
            }
        } else if (Objects.equals(dropDownBedrooms.getSelectedItem(), "3")) {
            perRoomPrice *= 2;
            if (parksideButton.isSelected()) {
                currentPrice = parksidePrice + perRoomPrice;
            } else if (poolsideButton.isSelected()) {
                currentPrice = poolsidePrice + perRoomPrice;
            } else {
                currentPrice = lakesidePrice + perRoomPrice;
            }
        }


        if (Objects.equals(dropDownMeals.getSelectedItem(), "Yes")) {
            currentPrice += mealIncludedPrice;
        }
        totalPrice = "Total price is " + currentPrice;
        statusLabel.setText(totalPrice);
        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        JVacationRental frame = new JVacationRental();
    }
}
