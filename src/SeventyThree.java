import java.util.HashMap;

public class SeventyThree {
    public static void main(String[] args) {
        // Problem 73: Check if Two Strings Are Anagrams
        String s = "bello";
        String t = "hello";
        boolean ans = anagrams(s, t);
        System.out.println(ans);
    }

    public static boolean anagrams(String s, String t) {
        HashMap<Character, Integer> sFreq = new HashMap<>();
        HashMap<Character, Integer> tFreq = new HashMap<>();

        if (s.length() != t.length()) return false;

        for (char c : s.toCharArray()) {
            sFreq.put(c, sFreq.getOrDefault(c, 0)+1);
        }

        for (char c : t.toCharArray()) {
            tFreq.put(c, tFreq.getOrDefault(c, 0)+1);
        }

        return sFreq.equals(tFreq);
    }
}
