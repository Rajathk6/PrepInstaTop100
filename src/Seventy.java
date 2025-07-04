public class Seventy {
    public static void main(String[] args) {
        // Problem 70: Count Substrings with Equal Number of 0s and 1s
        String s = "00110011";
        int ans = substringsWithEqualNumber(s);
        System.out.println(ans);
    }

    public static int substringsWithEqualNumber(String s) {
        int count = 0;
        int prevGroup = 0;
        int currGroup = 1;

        for (int i=1; i<s.length(); i++) {
            if (s.charAt(i) == s.charAt(i-1)) currGroup++;
            else {
                count += Math.min(prevGroup, currGroup);
                prevGroup = currGroup;
                currGroup = 1;
            }
        }
        count += Math.min(prevGroup, currGroup);
        return count;
    }
}
