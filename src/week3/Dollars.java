package week3;

import java.util.Scanner;

public class Dollars {
    public static void main(String[] args) {
        int amount;
        int newAmount;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the amount: ");
        amount = input.nextInt();

        int twentiesCalculation = amount / 20;
        System.out.print("Number of 20s: " + twentiesCalculation + "\n");
        newAmount = amount - (twentiesCalculation * 20);

        int tensCalculation = newAmount / 10;
        System.out.print("Number of 10s: " + tensCalculation + "\n");
        newAmount -= (tensCalculation * 10);

        int fivesCalculation = newAmount / 5;
        System.out.print("Number of 05s: " + fivesCalculation + "\n");
        newAmount -= (fivesCalculation * 5);

        System.out.print("Number of 01s: " + newAmount);

    }
}
