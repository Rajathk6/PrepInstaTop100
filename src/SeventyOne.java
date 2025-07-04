import java.util.HashSet;

public class SeventyOne {
    public static void main(String[] args) {
        // Problem 71: Longest Substring Without Repeating Characters
        String sent = "abcdabcbb";
        int ans = substringWithoutRepeatingChar(sent);
        System.out.println(ans);
    }

    public static int substringWithoutRepeatingChar(String sent) {
        HashSet<Character> seen = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        
        for (int right=0; right<sent.length(); right++) {
            char character = sent.charAt(right);

            while (seen.contains(character)) {
                seen.remove(sent.charAt(left));
                left++;
            }
            seen.add(character);
            maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }
}
