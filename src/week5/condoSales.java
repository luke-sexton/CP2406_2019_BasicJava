package week5;

import java.util.Scanner;

public class condoSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int condominiumPrice;
        String view;

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
            view = park;
            condominiumPrice = parkCost;
            System.out.println("View: " + view);
            System.out.println("Cost: " + condominiumPrice + "\n");
            getGarageOption(view, condominiumPrice);
        } else if (userChoice == 2) {
            view = golf;
            condominiumPrice = golfCost;
            System.out.println("View: " + view);
            System.out.println("Cost: " + condominiumPrice + "\n");
            getGarageOption(view, condominiumPrice);
        } else if (userChoice == 3) {
            view = lake;
            condominiumPrice = lakeCost;
            System.out.println("View: " + view);
            System.out.println("Cost: " + condominiumPrice + "\n");
            getGarageOption(view, condominiumPrice);
        } else {
            condominiumPrice = 0;
            System.out.println("Invalid Option");
            System.out.println("Cost: " + condominiumPrice);
        }

    }

    public static void getGarageOption(String view, int condominiumPrice) {
        int garage = 5000;
        Scanner input = new Scanner(System.in);

        String parkingChoiceString = "Please choose parking option \n" + "1 - Garage \n" + "2 - Parking Space";
        System.out.println(parkingChoiceString);

        int userChoice = input.nextInt();

        if (userChoice == 1) {
            condominiumPrice += garage;
            System.out.println("Garage has been selected..");
            System.out.println("View: " + view);
            System.out.println("Cost with garage: " + condominiumPrice);
        }
        else {
            System.out.println("No garage selected..");
            System.out.println("View: " + view);
            System.out.println("Cost: " + condominiumPrice);
        }
    }
}
