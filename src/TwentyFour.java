public class TwentyFour {
    public static void main(String[] args) {
        // Problem 24: Check Whether a Number is a Neon Number
        int n = 9;
        String ans = neonNumber(n);
        System.out.println(ans);
    }

    public static String neonNumber(int n) {
        int squaredN = n*n;
        int sum = 0;

        if (n<0) return "Not a Neon Number";
        while (squaredN != 0) {
            int lastDigit = squaredN%10;
            sum+=lastDigit;
            squaredN/=10;
        }
        return sum == n ? "Neon Number" : "Not a Neon Number";
    }
}
