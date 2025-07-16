import java.util.Arrays;

public class HundredSix {
    public static void main(String[] args) {
        // Problem 106: Find minimum sum of absolute difference in array
        int[] arr = {1,2,3,4,7,5,9};
        int result = minimumSum(arr);
        System.out.println(result);
    }

    public static int minimumSum(int[] arr) {
        int localDifference = 0;
        int maxDifference = 0;
        Arrays.sort(arr);
        for (int i = 1; i<arr.length; i++){
            localDifference = arr[i] - arr[i-1];
            maxDifference+=localDifference;
        }
        return maxDifference;
    }
}
