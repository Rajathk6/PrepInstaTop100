public class HundredThirtyFive {
    public static void main(String[] args) {
        // Problem 135: Check if Two Strings Match Where One Contains Wildcard
        // Characters
        String pattern = "a*bc?";
        String text = "axyzbcx";
        boolean result = isWildcardMatch(pattern, text);
        System.out.println(result);
    }

    public static boolean isWildcardMatch(String pattern, String text) {
    int pLen = pattern.length();
    int tLen = text.length();
    boolean[][] dp = new boolean[pLen + 1][tLen + 1];

    // 1. Base case: empty pattern vs. empty text
    dp[0][0] = true;

    // 2. Handle patterns that start with '*' matching an empty text
    for (int i = 1; i <= pLen; i++) {
        if (pattern.charAt(i - 1) == '*') {
            dp[i][0] = dp[i - 1][0];
        }
    }

    // 3. Fill the DP table
    for (int i = 1; i <= pLen; i++) {
        for (int j = 1; j <= tLen; j++) {
            char pc = pattern.charAt(i - 1);
            char tc = text.charAt(j - 1);

            // '?' matches exactly one character
            if (pc == '?') {
                dp[i][j] = dp[i - 1][j - 1];

            // '*' matches zero characters (dp[i-1][j]) 
            // or one more character (dp[i][j-1])
            } else if (pc == '*') {
                dp[i][j] = dp[i - 1][j] || dp[i][j - 1];

            // exact character match
            } else {
                dp[i][j] = (pc == tc) && dp[i - 1][j - 1];
            }
        }
    }
    
    // 4. Final answer: full pattern vs. full text
    return dp[pLen][tLen];
}
}
