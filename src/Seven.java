public class Seven {
    public static void main(String[] args) {
        //  Problem 7: Greatest of the Three Numbers
        long a = 5; 
        long b = 5;
        long c = 100;
        long ans = greatestOfThreeNumbers(a, b, c);
        System.out.println(ans);
    }

    public static long greatestOfThreeNumbers(long a, long b, long c) {
        if (a==b && b==c) return a;

        long max = a;
        if (b>max) max = b;
        if (c>max) max = c;

        return max;
    }
}
