package week6;

import java.util.Scanner;

public class CountMovieSpaces2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your favourite movie quote: ");
        String userQuote = input.nextLine();
        countSpaces(userQuote);

    }

    static void countSpaces(String userQuote) {
        int length = userQuote.length();
        int spacesCount = 0;

        for (int x = 0; x < length; ++x) {
            if (userQuote.charAt(x) == ' ') {
                spacesCount += 1;
            }
        }
        System.out.println("Amount of spaces in favourite movie quote: "+ userQuote + " = " + spacesCount);
    }
}
