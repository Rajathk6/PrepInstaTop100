public class TwentyTwo {
    public static void main(String[] args) {
        // Problem 22: Check Whether a Number is a Harshad Number
        int n = 19;
        String ans = harshadNumber(n);
        System.out.println(ans);
    }

    public static String harshadNumber(int n) {
        int sum = 0;
        int temp = n;
        if (n==0) return "Not a Harshad Number";
        
        while (temp!=0) {
            int lastDigit = temp%10;
            sum+=lastDigit;
            temp/=10;
        }
        return n%sum==0 ? "Harshad Number" : "Not a Harshad Number";
    }
}
