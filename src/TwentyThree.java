public class TwentyThree {
    public static void main(String[] args) {
        // Problem 23: Check Whether a Number is an Automorphic Number
        int n = 116;
        String ans = automorphicNumber(n);
        System.out.println(ans);
    }

    public static String automorphicNumber(int n) {
        int squaredN = n*n;
        int temp = n;

        if (n==0) return "Automorphic Number";

        while (temp!=0) {
            int lastDigitSquaredN = squaredN%10;
            int lastDigitN = temp%10;
            if (lastDigitN != lastDigitSquaredN) return "Not a Automorphic number";
            else {
                squaredN/=10;
                temp/=10;
            }
        }
        return "Automorphic Number";
    }
}
