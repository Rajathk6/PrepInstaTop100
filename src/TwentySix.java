public class TwentySix {
    public static void main(String[] args) {
        // Problem 26: Check Whether a Number is a Spy Number
        int n = 1124;
        String ans = spyNumber(n);
        System.out.println(ans);
    }

    public static String spyNumber(int n) {
        int sum = 0;
        int product = 1;
        int temp = n;
        
        if (n<=0) return "Not a Spy Number";

        while (temp!=0) {
            int lastDigit = temp%10;
            sum+=lastDigit;
            product*=lastDigit;
            temp/=10;
        }
        return sum == product ? "Spy Number" : "Not a Spy Number";
    }
}
