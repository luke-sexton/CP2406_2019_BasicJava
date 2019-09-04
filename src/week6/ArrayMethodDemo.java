package week6;

import java.util.Arrays;
import java.util.Collections;

public class ArrayMethodDemo {
    public static void main(String[] args) {
        Integer[] integerArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        displayIntegerArray(integerArray);
        reverseIntegerArray(integerArray);
        sumIntegerArray(integerArray);

        int lessThanValue = 5;
        displayLessThan(integerArray, lessThanValue + 1);

        displayHigherThanAverage(integerArray);


    }

    public static void displayIntegerArray(Integer[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void reverseIntegerArray(Integer[] array) {
        Collections.reverse(Arrays.asList(array));
        System.out.println(Arrays.toString(array));
    }

    public static void sumIntegerArray(Integer[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        System.out.println("Sum of all values in array: " + sum);
    }

    public static void displayLessThan(Integer[] array, int value) {
        StringBuilder displayLessThanArray = new StringBuilder();
        for (int number : array) {
            if (number < value) {
                displayLessThanArray.append(number).append(" ");
            }
        }
        System.out.println(displayLessThanArray);
    }

    public static void displayHigherThanAverage(Integer[] array) {
        int sum = 0;
        int average;
        StringBuilder displayHigherThanAverage = new StringBuilder("Numbers higher than average: ");

        for (int number : array) {
            sum += array[number];
        }

        average = sum / array.length + 1;

        for (int number : array) {
            if (array[number] > average) {
                displayHigherThanAverage.append(array[number]).append(" ");
            }
        }
        System.out.println(displayHigherThanAverage);
    }
}
