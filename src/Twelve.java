import java.util.Arrays;

public class Twelve {
    public static void main(String[] args) {
        // Problem 12: Reverse of a Number
        int n = -30;
        int ans = reverseNumber(n);
        System.out.println(ans);
    }

    public static int reverseNumber(int n) {
        int reversed = 0;
        int value = 0;
        while (n!=0) {
            value = n%10;
            reversed = reversed*10 + value;
            n = n/10;
        }
        return reversed;
    }
}
