import java.util.HashSet;
import java.util.Set;

public class HundredThirtyFour {
    public static void main(String[] args) {
        // Program 134: Count common subsequences in two strings
        String s1 = "abc";
        String s2 = "ac";
        int result = commonSubsequence(s1, s2);
        System.out.println(result);
    }

    public static int commonSubsequence(String s1, String s2) {
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        generateSubsequence(s1, 0, "", set1);
        generateSubsequence(s2, 0, "", set2);

        set1.retainAll(set2);

        return set1.size();
    }

    private static void generateSubsequence(String s, int index, String current, Set<String> set){
        if (index == s.length()) {
            if (!current.isEmpty()) set.add(current);
            return;
        }
        
        generateSubsequence(s, index+1, current+s.charAt(index), set);
        generateSubsequence(s, index+1, current, set);
    }
}
