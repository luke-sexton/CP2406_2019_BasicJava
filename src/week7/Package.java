package week7;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Package {
    int ouncesWeight;
    char shippingMethod;
    double shippingCost;

    public Package(int weight, char shippingMethod) {
        this.ouncesWeight = weight;
        this.shippingMethod = shippingMethod;
        calculateCost(weight, shippingMethod);
    }

    private void calculateCost(int weight, char shippingMethod) {
        int weightRangeOne = 8, weightRangeTwo = 16;
        String weightString = "";

        if (weight <= weightRangeOne) {
            weightString = "1-8";
        } else if (weight > weightRangeTwo) {
            weightString = "17+";
        } else {
            weightString = "9-16";
        }


        switch (weightString + shippingMethod) {
            case ("1-8A"):
                shippingCost = 2.00;
                break;
            case ("1-8T"):
            case ("9-16M"):
                shippingCost = 1.5;
                break;
            case ("1-8M"):
                shippingCost = 0.5;
                break;
            case ("9-16A"):
                shippingCost = 3.00;
                break;
            case ("9-16T"):
                shippingCost = 2.35;
                break;
            case ("17+A"):
                shippingCost = 4.50;
                break;
            case ("17+T"):
                shippingCost = 3.25;
                break;
            case ("17+M"):
                shippingCost = 2.15;
        }
    }

    public void displayPackage() {
        NumberFormat formatter = new DecimalFormat("#0.00");
        System.out.println("\nWeight (grams): " + ouncesWeight + "\nShipping Method: " + shippingMethod +
                "\nShipping Cost: $" + formatter.format(shippingCost));
    }
}
