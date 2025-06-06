import java.util.ArrayList;
import java.util.Arrays;

public class Ten {
    public static void main(String[] args) {
        // Problem 10: Prime Numbers Within a Given Range
        int start = 1;
        int end = 10;
        int[] ans = primeNumberWithinRange(start, end);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] primeNumberWithinRange(int start, int end) {
        ArrayList<Integer> answerArray = new ArrayList<>();

        while (start <= end) {
            if (start == 2 || start == 3) answerArray.add(start);
            if (start % 2 == 0 || start % 3 == 0) {};

        }
        return new int[]{2,3};
    }
} 


// RESOLVE