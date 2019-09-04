package week6;

import javax.swing.*;

public class CarCareChoice {
    public static void main(String[] args) {
        String[] choiceArray = {"1 - oil change", "2 - tire rotation", "3 - battery check", "4 - brake inspection"};
        Double[] choicePriceArray = {25.00, 22.00, 15.00, 5.00};

        String errorMessage = "Invalid Option\n";
        StringBuilder displayStringChoice = new StringBuilder("Please enter a following care option: \n"
                + choiceArray[0] + "\n" + choiceArray[1] + "\n" + choiceArray[2] + "\n" + choiceArray[3]);
        StringBuilder displayUserInformation = new StringBuilder("Care Option: ");

        int userInput = Integer.parseInt(JOptionPane.showInputDialog(displayStringChoice));

        while (!(userInput == 1 || userInput == 2 || userInput == 3 || userInput == 4)) {
            System.out.println(errorMessage);
            userInput = Integer.parseInt(JOptionPane.showInputDialog(displayStringChoice));
        }

        double userChoicePrice;
        String careOptionChoice;
        for (int i = 0; i <= choiceArray.length; ++i) {
            if (userInput == i) {
                careOptionChoice = choiceArray[i - 1];
                userChoicePrice = choicePriceArray[i - 1];
                displayUserInformation.append(careOptionChoice).append("\nCare Option Price: $").append(userChoicePrice);
            }
        }
        System.out.println(displayUserInformation);

    }
}
