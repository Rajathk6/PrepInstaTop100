public class SixtySeven {
    public static void main(String[] args) {
        // Problem 67: Last Non-Zero Digit in Factorial
        int n = 10;
        int fact = factorial(n);
        int ans = nonZeroDigit(fact);
        System.out.println(ans);
    }

    public static int factorial(int n) {
        if (n==1) return 1;
        return n*factorial(n-1);
    }

    public static int nonZeroDigit(int fact) {
        while (fact%10 == 0) {
            fact/=10;
        } 
        return fact%10;
    }
}
