package week3;

public class InchesToFeet {
    int inches = 86;
    int footCalculation = inches / 12;
    int remainingInches = inches % 12;

    void displayFootLength(int inches) {
        if (remainingInches == 0) {
            System.out.print(inches + " inches in feet is " + footCalculation + " foot long.");
        } else
            System.out.print(inches + " inches in feet is " + footCalculation + " feet and " + remainingInches + " inches.");
    }
}
