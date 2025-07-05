public class SeventyEight {
    public static void main(String[] args) {
        // Problem 78: Find Factorial of a Number Using Recursion
        int n = 2;
        int ans = factorialRecursion(n, 1);
        System.out.println(ans);
    }

    public static int factorialRecursion(int n, int sum) {
        if (n==1) {
            return sum;
        }
        if (n==0) {
            return 1;
        }
        return factorialRecursion(n-1, sum*n);
    }
}
