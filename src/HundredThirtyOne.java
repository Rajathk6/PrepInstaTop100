import java.util.Arrays;

public class HundredThirtyOne {
    public static void main(String[] args) {
        // Problem 131: Check if Two Strings Are Anagrams or Not
        String s1 = "Listen";  
        String s2 = "Silent";

        boolean result = areAnagrams(s1, s2);
        System.out.println(result);
    }

    public static boolean areAnagrams(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if (s1.length() != s2.length()) return false;

        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1,a2);
    }
}
