public class FiftyThree {
    public static void main(String[] args) {
        // Problem 53: Finding Number of Times x Digit Occurs in a Given Input
        int n = 3245;
        int x = 5;
        int ans = countXInNumber(n, x);
        System.out.println(ans);
    }

    public static int countXInNumber(int n, int x) {
        int temp = Math.abs(x);
        int count = 0;
        while (temp!=0) {
            int lastDigit = temp%10;
            if (lastDigit == x) count++;
            temp/=10;
        }
        return count;
    }
}
