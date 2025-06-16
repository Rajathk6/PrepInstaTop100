public class FiftyFour {
    public static void main(String[] args) {
        // Problem 54: Finding Number of Integers Which Have Exactly X Divisors
        int n = 10, x = 4;
        int ans = numberOfIntegersWithXDivisors(n, x);
        System.out.println(ans);
    }

    public static int numberOfIntegersWithXDivisors(int n, int x) {
        int[] divisors = new int[n+1];

        for (int i=1; i<=n;i++) {
            for (int j=i; j<=n; j+=i) {
                divisors[j]++;
            }
        }

        int count = 0;
        for (int i=0; i<=n; i++) {
            if (divisors[i] == x) {
                count++;
            }
        }
        return count;
    }
}
