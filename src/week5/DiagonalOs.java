package week5;

import java.util.Scanner;

public class DiagonalOs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String letter = "O";
        String space = " ";

        String userChoiceString = "Please enter a number: ";
        System.out.println(userChoiceString);
        int userChoice = input.nextInt();

        for (int i = 0; i < userChoice; i++) {
            for (int count = 0; count < i; count++) {
                System.out.print(" ");
            }
            System.out.println(letter);
        }
    }
}
