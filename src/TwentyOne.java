public class TwentyOne {
    static int[] factorial = new int[10];
    public static void main(String[] args) {
        // Problem 21: Find All Strong Numbers in a Given Range
        int start = 1;
        int end = 50000;
        strongNumberInRange(start, end);
    }

    static {
        factorial[0] = 1;
        for (int i=1; i<=9; i++) {
            factorial[i] = factorial[i-1] * i;
        }
    }

    public static void strongNumberInRange(int start, int end) {
        for (int i=start; i<=end; i++) {
            if (isStrong(i)) {
                System.out.println(i + " ");
            }
        }
    }

    public static boolean isStrong(int n) {
        int sum = 0;
        int temp = n;
        while (temp!=0) {
            int lastDigit = temp%10;
            sum+=factorial[lastDigit];
            temp/=10;
        }
        return sum == n;
    }
}
