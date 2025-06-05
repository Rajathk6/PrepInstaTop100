public class Nine {
    public static void main(String[] args) {
        // Problem 9: Prime Number.
        long n = 49;
        String ans = primeNumber(n);
        System.out.println(ans);
    }
    public static String primeNumber(long n) {
        if (n<=1) return "Not Prime";
        if (n == 2 || n == 3 || n== 5) return "Prime";
        if (n%2 == 0 || n%3 == 0 || n%5 == 0) return "Not Prime";
        return "Prime";
    }
}


// INCORRECT SOLUTION (RESOLVE)