public class FiftyEight {
    public static void main(String[] args) {
        // Problem 58: Find the Largest Element in an Array Using Recursion
        int[] arr = {2,5,189,2,99};
        int n = arr.length-1;
        int ans = largestElementRecursion(arr, n);
        System.out.println(ans);
    }

    public static int largestElementRecursion(int[] arr, int n) {
        if (n==0) return arr[0];

        int max = largestElementRecursion(arr, n-1);
        return Math.max(arr[n], max);
    }
}
