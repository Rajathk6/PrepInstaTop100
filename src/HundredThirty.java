import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HundredThirty {
    public static void main(String[] args) {
        // Problem 130: Find Non-Repeating Characters in a String
        String s = "stress ball";
        List<Character> result = findUniqueCharacters(s);
        System.out.println(result);
    }

    public static List<Character> findUniqueCharacters(String s) {
        Map<Character, Integer> unique = new HashMap<>();
        List<Character> uni = new ArrayList<>();
        
        for (char ch : s.toCharArray()) {
            unique.put(ch, unique.getOrDefault(ch, 0) + 1);
        }

        for (char c : unique.keySet()) {
            if (unique.get(c) == 1) uni.add(c);
        }
        return uni;
    }
}
