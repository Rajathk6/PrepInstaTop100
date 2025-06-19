import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SixtyEight {

    public static void main(String[] args) {
        // Problem 68: Return the Nth row of Pascal’s Triangle
        int n = 6;
        List<Integer> row = nPascalTriangle(n);
        System.out.println(row);
    }

    public static List<Integer> nPascalTriangle(int n) {
        if (n==1) return Arrays.asList(1);

        List<Integer> prevRow = nPascalTriangle(n-1);
        List<Integer> currRow = new ArrayList<>();

        currRow.add(1);
        for (int i=1; i<prevRow.size(); i++) {
            int val = prevRow.get(i-1) + prevRow.get(i);
            currRow.add(val);
        }
        currRow.add(1);
        return currRow;
    }
}
