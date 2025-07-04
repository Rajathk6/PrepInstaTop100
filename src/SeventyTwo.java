import java.util.HashMap;

public class SeventyTwo {
    public static void main(String[] args) {
        // Problem 72: Find the First Non-Repeating Character in a String
        String s = "loveleetcode";
        int ans = firstNonRepeatingCharacter(s);
        System.out.println(ans);
    }

    public static int firstNonRepeatingCharacter(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0)+1);
        }

        for (int i=0; i<s.length(); i++) {
            if (freq.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}