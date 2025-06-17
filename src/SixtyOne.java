public class SixtyOne {
    public static void main(String[] args) {
        // Problem 61: Count Total Number of Digits in a Number Using Recursion
        int n = 52343;
        int ans = digitsInNumberRecursion(n);
        System.out.println(ans);
    }

    public static int digitsInNumberRecursion(int n) {
        if (n==0) return 0;
        return 1+digitsInNumberRecursion(n/10);
    }
}
