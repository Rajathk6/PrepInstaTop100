public class TwentyFive {
    public static void main(String[] args) {
        // Problem 25: Check Whether a Number is a Disarium Number
        int n = 90;
        String ans = disariumNumber(n);
        System.out.println(ans);
    }

    public static String disariumNumber(int n) {
        String number = Integer.toString(n);
        int sum = 0;
        if (n<0) return "Not a Disarium Number";
        for (int i=0; i<number.length(); i++) {
            sum += Math.pow(number.charAt(i) - '0', i+1);
        }
        return sum == n ? "Disarium Number" : "Not a Disarium Number";
    }
}
