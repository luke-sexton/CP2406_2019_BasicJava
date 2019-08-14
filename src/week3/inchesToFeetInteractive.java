package week3;

import java.util.Scanner;

public class inchesToFeetInteractive {
    public static void main(String[] args) {
        int inches;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number of inches you wish to convert to Feet: ");
        inches = input.nextInt();
        int footCalculation = inches / 12;
        int remainingInches = inches % 12;

        if (remainingInches == 0) {
            System.out.print(inches + " inches in feet is " + footCalculation + " foot long.");
        } else
            System.out.print(inches + " inches in feet is " + footCalculation + " feet and " + remainingInches + " inches.");
    }
}
