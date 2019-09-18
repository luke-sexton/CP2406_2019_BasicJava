package week7;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class InsuredPackage extends Package {
    double insuranceCost;
    public InsuredPackage(int weight, char shippingMethod) {
        super(weight, shippingMethod);
        calculateInsuranceCost(shippingCost);
    }

    public void calculateInsuranceCost(double shippingCost) {
        double insuranceRangeOne = 1.00;
        double insuranceRangeTwo = 3.01;
        String costString = "";

        if (shippingCost < insuranceRangeOne) {
            costString = "0.00-1.00";
        } else if (shippingCost >= insuranceRangeTwo) {
            costString = "3.01+";
        } else {
            costString = "1.01-3.00";
        }
        switch (costString) {
            case ("0.00-1.00"):
                insuranceCost = 2.45;
                break;
            case ("1.01-3.00"):
                insuranceCost = 3.95;
                break;
            case ("3.01+"):
                insuranceCost = 5.55;
        }
    }

    public void displayPackage() {
        NumberFormat formatter = new DecimalFormat("#0.00");
        double totalCost = shippingCost + insuranceCost;

        System.out.println("\nWeight (grams): " + ouncesWeight + "\nShipping Method: " + shippingMethod +
                "\nShipping Cost: $" + formatter.format(shippingCost) + "\nInsurance Cost: $" +
                formatter.format(insuranceCost) + "\nTotal Cost: $" + formatter.format(totalCost));
    }
}
