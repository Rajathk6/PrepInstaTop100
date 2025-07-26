import java.util.Arrays;

public class HundredFourtyThree {
    public static void main(String[] args) {
        // problem 143: Minimize the Maximum Difference Between Height
        int[] arr = { 1, 15, 10 };
        int k = 6;
        int result = minimizeMaxDifference(arr, k);
        System.out.println(result);
    }

    public static int minimizeMaxDifference(int[] arr, int k) {
        int n = arr.length;
        if (n == 1) return 0;

        Arrays.sort(arr);

        int ans = arr[n - 1] - arr[0];
        int min, max;

        for (int i = 1; i < n; i++) {
            if (arr[i]-k < 0) continue;
            min = Math.min(arr[0] + k, arr[i] - k);
            max = Math.max(arr[i - 1] + k, arr[n - 1] - k);
            ans = Math.min(ans, max - min);
        }
        return ans;
    }
}
