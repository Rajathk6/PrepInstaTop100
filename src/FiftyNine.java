public class FiftyNine {
    public static void main(String[] args) {
        // Problem 59: Find the Smallest Element in an Array Using Recursion
        int[] arr = {0,5,189,2,99};
        int n = arr.length-1;
        int ans = smallestElementRecursion(arr, n);
        System.out.println(ans);
    }
    public static int smallestElementRecursion(int[] arr, int n) {
        if (n==0) return arr[0];

        int min = smallestElementRecursion(arr, n-1);
        return Math.min(arr[n], min);
    }
}
