import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class HundredThirtySix {
    public static void main(String[] args) {
        // Problem 136: Print All Permutations of a String in Lexicographically Sorted Order
        String s = "abc";
        List<String> result = getSortedPermutation(s);
        System.out.println("\nFinal Permutations:");
        System.out.println(result); 
    }
    
    public static List<String> getSortedPermutation(String s) {
        List<String> result = new ArrayList<>();
        char[] ch = s.toCharArray();
        Arrays.sort(ch); // Ensure lexicographic order
        boolean[] used = new boolean[s.length()];

        backtrack(ch, new StringBuilder(), used, result, 0);
        return result;
    }

    private static void backtrack(char[] ch, StringBuilder temp, boolean[] used, List<String> result, int depth) {
        // 👣 Log current recursion level and partial result
        System.out.println("  ".repeat(depth) + "-> " + temp.toString());

        if (temp.length() == ch.length) {
            result.add(temp.toString());
            System.out.println("  ".repeat(depth) + "-> Saved: " + temp.toString());
            return;
        }

        for (int i = 0; i < ch.length; i++) {
            if (used[i]) continue;
            if (i > 0 && ch[i] == ch[i-1] && !used[i-1]) continue;

            used[i] = true;
            temp.append(ch[i]);
            backtrack(ch, temp, used, result, depth + 1);   
            temp.deleteCharAt(temp.length() - 1);
            used[i] = false;
        }
    }
}