package week5;

import java.util.Scanner;

public class AscendingAndDescending {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String inputMessage = "Please enter three numbers: ";
        System.out.println(inputMessage);

        int numOne = input.nextInt();
        int numTwo = input.nextInt();
        int numThree = input.nextInt();

        displayOrder(numOne, numTwo, numThree);
    }

    public static void displayOrder(int numOne, int numTwo, int numThree) {
        int lowestNum = getLowestNum(numOne, numTwo, numThree);
        int highestNum = getHighestNum(numOne, numTwo, numThree);
        int midNum = getMidNum(numOne, numTwo, numThree, lowestNum, highestNum);

        String ascendingOrder = "Ascending order: " + lowestNum + " " + midNum + " " + highestNum;
        String descendingOrder = "Descending order: " + highestNum + " " + midNum + " " + lowestNum;

        System.out.println(ascendingOrder);
        System.out.println(descendingOrder);
    }

    public static int getLowestNum(int numOne, int numTwo, int numThree) {
        int lowestNum;

        if (numOne < numTwo && numOne < numThree) {
            lowestNum = numOne;
        }
        else if (numTwo < numOne && numTwo < numThree) {
            lowestNum = numTwo;
        }
        else {
            lowestNum = numThree;
        }
        return lowestNum;
    }

    public static int getMidNum(int numOne, int numTwo, int numThree, int lowestNum, int highestNum) {
        int middleNum;

        if ((numTwo == lowestNum && numThree == highestNum) || (numTwo == highestNum && numThree == lowestNum)) {
            middleNum = numOne;
        }
        else if ((numOne == lowestNum && numThree == highestNum) || (numOne == highestNum && numThree == lowestNum)) {
            middleNum = numTwo ;
        }
        else {
            middleNum = numThree;
        }
        return middleNum;
    }

    public static int getHighestNum(int numOne, int numTwo, int numThree) {
        int highestNum;

        if (numOne > numTwo && numOne > numThree) {
            highestNum = numOne;
        } else if (numTwo > numOne && numTwo > numThree) {
            highestNum = numTwo;
        } else {
            highestNum = numThree;
        }
        return highestNum;
    }


}
