public class FortyEight {
    public static void main(String[] args) {
        // Problem 48: Count Possible Decodings of a Digit Sequence
        String s = "1126";
        int ways = countDecodings(s);
        System.out.println(ways); 
    }

    public static int countDecodings(String s) {
        if (s == null || s.length() == 0 || s.charAt(0) == '0') return 0;
        int n = s.length();
        int[] dp = new int[n + 1];

        dp[0] = 1; // empty string
        dp[1] = 1; // single character, already validated

        for (int i = 2; i <= n; i++) {
            // One digit check
            if (s.charAt(i - 1) != '0')
                dp[i] += dp[i - 1];

            // Two digits check
            int twoDigit = Integer.parseInt(s.substring(i - 2, i));
            if (twoDigit >= 10 && twoDigit <= 26)
                dp[i] += dp[i - 2];
        }

        return dp[n];
    }
}
