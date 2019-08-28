package week3;

import java.util.Scanner;

public class Dollars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int amount;
        int remainder;

        System.out.print("Please enter the amount: ");
        amount = input.nextInt();

        remainder = amount % 20;
        int twenties = (amount - remainder) / 20;
        amount = remainder;

        remainder = amount % 10;
        int tens = (amount - remainder) / 10;
        amount = remainder;

        remainder = amount % 5;
        int fives = (amount - remainder) / 5;
        amount = remainder;

        int ones = amount;

        System.out.print("Number of 20s: " + twenties + "\nNumber of 10s: " + tens + "\nNumber of 05s: " + fives + "\nNumber of 01s: " + ones + "\n");
    }
}
