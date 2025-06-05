public class Four {
    public static void main(String[] args) {
        // Problem 4: Sum of N Natural Numbers

        long n = -10;
        long ans = sumNNaturalNumbers(n);
        System.out.println(ans);
    }

    public static long sumNNaturalNumbers(long n) {
        if (n==0) return 0;
        else if (n>0) return n*(n+1)/2;
        else return -1;
    }
}
