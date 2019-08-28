package week3;

import java.util.Scanner;

public class Dollars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the amount: ");

        int amount = input.nextInt();
        int[] notesArray = {20, 10, 5, 1};

        for (int value : notesArray) {
            int remainder = amount % value;
            int notes = (amount - remainder) / value;
            amount = remainder;

            System.out.println("Number of " + value + "s: " + notes);
        }
    }
}
