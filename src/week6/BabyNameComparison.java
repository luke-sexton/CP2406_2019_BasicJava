package week6;

import java.util.Scanner;

public class BabyNameComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter three first names: ");
        String firstName = input.next();
        String secondFirstName = input.next();
        String thirdFirstName = input.next();

        System.out.println(firstName + "-" + secondFirstName);
        System.out.println(firstName + "-" + thirdFirstName);
        System.out.println(secondFirstName + "-" + firstName);
        System.out.println(secondFirstName + "-" + thirdFirstName);
        System.out.println(thirdFirstName + "-" + firstName);
        System.out.println(thirdFirstName + "-" + secondFirstName);

    }
}
