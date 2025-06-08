public class TwentyEight {
    public static void main(String[] args) {
        // Problem 28: Check Whether a Number is a Buzz Number
        int n = 700000;
        String ans = buzzNumber(n);
        System.out.println(ans);
    }

    public static String buzzNumber(int n) {

        if (n==0) return "Not a Buzz Number";

        boolean ends = n%10 == 7;
        boolean divides = n%7 == 0;
        
        return (ends || divides ) ? "Buzz Number" : "Not a Buzz Number";
    }
}
