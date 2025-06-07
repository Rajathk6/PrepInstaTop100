public class Fourteen {
    public static void main(String[] args) {
        // Problem 14: Armstrong Number
        int n = 235;
        String ans = armstrongNumber(n);
        System.out.println(ans);
    }

    public static String armstrongNumber(int n) {
        String number = Integer.toString(n);
        int count = number.length();
        int sum = 0;
        if (n<0) return "Not Armstrong";
        if (n<=9) return "Armstrong";

        for (int i=0; i<count; i++) {
            int digit = number.charAt(i) - '0';
            sum+= Math.pow(digit, count);
        }
        return sum == n ? "Armstrong" : "Not Armstrong";
    }
}
