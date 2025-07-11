import java.util.ArrayList;
import java.util.List;

public class NintyOne {
    public static void main (String[] args) {
        // Problem 91: Palindromic Partitioning
        String s = "aab";
        List<List<String>> result = new ArrayList<>();
        partitionPalindrome(s, 0, new ArrayList<>(), result);
        
        for (List<String> partition : result) {
            System.out.print(partition);
        }
    }

    public static void partitionPalindrome(String s, int start, List<String> current, List<List<String>> result) {
        if (start == s.length()) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int end = start+1; end <= s.length(); end++) {
            String prefix = s.substring(start, end);
            if (isPalindrome(prefix)) {
                current.add(prefix);
                partitionPalindrome(s, end, current, result);
                current.remove(current.size()-1);
            }
        }
    }

    public static boolean isPalindrome(String s) {
        int first = 0;
        int last = s.length()-1;

        while (first < last) {
            if (s.charAt(first) != s.charAt(last)) return false;
            first++;
            last--;
        }
        return true;
    }
}
