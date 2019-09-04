package week6;

// Sum and average an array of integers
public class DebugEight2 {
    public static void main(String[] args) {
        int[] someNums = {4, 17, 22, 8, 35};
        int tot = 0;
        int length = someNums.length;
        int average = tot / length;
       for (int someNum : someNums) {
          tot += someNum;
       }
        System.out.println("Sum is " + tot);
        System.out.println("Average is " + average);
    }
}
