package week5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AscendingAndDescending {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userNumOne, userNumTwo, userNumThree;
        String userInputString = "Please enter three numbers: ";

        // Get user input
        System.out.println(userInputString);

        userNumOne = input.nextInt();
        userNumTwo = input.nextInt();
        userNumThree = input.nextInt();

        // Store user input in an array
        Integer[] numArray = {userNumOne, userNumTwo, userNumThree};
        Arrays.sort(numArray);
        System.out.println("Ascending Order: " + Arrays.toString(numArray));

        // Reverse order of list array
        Collections.reverse(Arrays.asList(numArray)); //
        System.out.println("Descending Order: " + Arrays.toString(numArray));

    }
}