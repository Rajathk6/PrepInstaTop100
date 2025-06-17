public class SixtyTwo {
    public static void main(String[] args) {
        // Problem 62: Reversing a Number using Recursion
        int n = 12345;
        int ans = reverseNumberRecursion(n, 0);
        System.out.println(ans);
    } 

    public static int reverseNumberRecursion(int n, int result) {
        if (n==0) return result;
        int lastDigit = n%10;
        return reverseNumberRecursion(n/10, result*10 + lastDigit);
    }
}
