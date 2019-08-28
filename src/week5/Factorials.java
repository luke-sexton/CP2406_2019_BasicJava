package week5;

public class Factorials {
    public static void main(String[] args) {
        final int MIN = 1;
        final int MAX = 10;

        int factorial = 1;
        for (int i = MIN; i < MAX; i++) {
            factorial *= i;
            System.out.println("Number: " + i + " Factorial Equals: " + factorial);
        }
    }
}
