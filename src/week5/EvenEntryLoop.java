package week5;

import java.util.Scanner;

public class EvenEntryLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int SENTINEL_VALUE = 999;

        System.out.println("Please enter an even number or the Sentinel Value of " + SENTINEL_VALUE + " to end this..");
        int userInput = input.nextInt() ;
        while (userInput % 2 == 1) {
            if (userInput != SENTINEL_VALUE) {
                System.out.println("Error.. Please try again..");
                userInput = input.nextInt();
            }
            else {
                break;
            }
        }
        System.out.println("Good Job!");
    }
}
