public class Twenty {
    // static int[] factorial = new int[10];
    public static void main(String[] args) {
        // Problem 20: Check Whether a Number is a Strong Number
        int n = 40585;
        String ans = strongNumber(n);
        System.out.println(ans);
    }
    public static String strongNumber(int n) {
        if (n<1) return "Not a Strong Number";
        int sum = 0;
        int value = n;
        while (value!=0) {
            int lastDigit = value%10;
            sum+=fact(lastDigit);
            value/=10;
        }
        return sum == n ? "Strong Number" : "Not a Strong Number";
    }

    // static {
    // factorial[0] = 1;
    //     for (int i=1; i<=9; i++) {
    //         factorial[i] = factorial[i-1] * i;
    //     }
    // }

    public static int fact(int n) {
        int sum = 1;
        for (int i=2; i<=n; i++) {
            sum *=i;
        }
        return sum;
    } 
}


// OPTIMISED FACTORIAL

