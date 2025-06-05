public class Six {
    public static void main(String[] args) {
        // Problem 6: Greatest of Two Numbers
        long a = -5;
        long b = -2;
        long ans = greatestOfTwoNumber(a, b);
        System.out.println(ans);
    }

    public static long greatestOfTwoNumber(long a, long b) {
        if (a>b) return a;
        else if (b>a) return b;
        else return 0;
    }
}
