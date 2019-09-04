package week6;

import javax.swing.*;

public class DistanceFromAverage {
    public static void main(String[] args) {
        final int STOP = 99999;

        Double[] inputArray = new Double[100];
        StringBuffer errorMessage = new StringBuffer("Error, no values were entered");
        StringBuilder displayResults = new StringBuilder();
        int x = 0;
        int maximumValue = 20;
        double entry;
        double average;
        double sum = 0;
        double distanceFromAverage;

        entry = Double.parseDouble(JOptionPane.showInputDialog("Enter a double valued number up to 20:  \n(Enter 99999 to quit)"));


        while (entry != (STOP)) {
            if (entry > maximumValue) {
                System.out.println(errorMessage);
                entry = Double.parseDouble(JOptionPane.showInputDialog("Enter a double valued number up to 20:  \n(Enter 99999 to quit)"));
            } else {
                inputArray[x] = entry;
                entry = Double.parseDouble(JOptionPane.showInputDialog("Enter a double valued number up to 20:  \n(Enter 99999 to quit)"));
                sum += inputArray[x];
                x += 1;
                average = sum / x;
                distanceFromAverage = (average - inputArray[x-1]) * -1; // Make positive number
                displayResults.append("Value Entered: ").append(inputArray[x - 1])
                        .append("\n\nTotal Numbers: ").append(x).append("\nAverage: ").append(average)
                        .append("\nDistance From Average: ").append(distanceFromAverage).append("\n\n");
            }
        }
        JOptionPane.showMessageDialog(null, displayResults);
    }
}
