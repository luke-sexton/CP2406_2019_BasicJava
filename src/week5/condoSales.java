package week5;

import java.util.Scanner;

public class condoSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int condominiumPrice;

        String park = "Park";
        int parkCost = 150000;
        String golf = "Golf Course";
        int golfCost = 170000;
        String lake = "Lake";
        int lakeCost = 210000;

        String userChoiceString = "Please choose a view option: \n" + "1 - " + park + "\n" + "2 - " + golf + "\n" + "3 - " + lake;
        System.out.println(userChoiceString);
        int userChoice = input.nextInt();

        if (userChoice == 1) {
            condominiumPrice = parkCost;

            System.out.println("View: " + park);
            System.out.println("Cost " + condominiumPrice);
        }
        else if (userChoice == 2) {
            condominiumPrice = golfCost;
            System.out.println("View: " + golf);
            System.out.println("Cost " + condominiumPrice);
        }
        else if (userChoice == 3) {
            condominiumPrice = lakeCost;
            System.out.println("View: " + lake);
            System.out.println("Cost: " + condominiumPrice);
        }
        else {
            condominiumPrice = 0;
            System.out.println("Invalid Option");
            System.out.println("Cost: " + condominiumPrice);
        }
    }
}
