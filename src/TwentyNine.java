public class TwentyNine {
    public static void main(String[] args) {
        // Problem 29: Check Whether a Number is a Duck Number
        int n = 0100;
        String ans = duckNumber(n);
        System.out.println(ans);
    }

    public static String duckNumber(int n) {
        int temp = n;
        if (n==0) return "Duck Number";

        while (temp!=0) {
            int lastDigit = temp%10;
            if (lastDigit != 0) {
                temp/=10;
            } else return "Duck Number";
        }
        return "Not a Duck Number";
    }
}


// OTHER ALTERNATIVE

// String number = Integer.toString(n);
// return number.contains("0") ? "duck number" : "not a duck number";