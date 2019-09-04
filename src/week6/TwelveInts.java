package week6;

import java.util.Arrays;
import java.util.Collections;

public class TwelveInts {
    public static void main(String[] args) {
        Integer[] twelveInts = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        System.out.println(Arrays.toString(twelveInts));
        Collections.reverse(Arrays.asList(twelveInts));
        System.out.println(Arrays.toString(twelveInts));


    }
}
