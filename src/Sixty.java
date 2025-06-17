public class Sixty {
    public static void main(String[] args) {
        // Problem 60: Sum of All Elements in an Array Using Recursion
        int[] arr ={10, -3, 4, 0};
        int n = arr.length-1;
        int ans = sumElementsRecursion(arr, n);
        System.out.println(ans);
    }

    public static int sumElementsRecursion(int[] arr, int n) {
        if (n==0) return arr[0];
        
        return arr[n] + sumElementsRecursion(arr, n-1);

    }
}
