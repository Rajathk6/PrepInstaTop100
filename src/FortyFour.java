public class FortyFour {
    public static void main(String[] args) {
        // Problem 44: Maximum Number of Handshakes
        int n = 5;
        int ans = maximumHandshakes(n);
        System.out.println(ans);
    }

    public static int maximumHandshakes(int n) {
        if (n == 0) return 0;
        return n*(n-1) / 2; 
    }
}
