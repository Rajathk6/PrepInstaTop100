import java.util.HashMap;
import java.util.Map;

public class HundredTwentyNine {
    public static void main(String[] args) {
        // Problem 129: Calculate Frequency of Characters in a String
        String s = "aAbb c@c";
        Map<Character, Integer> result = characterFrequency(s);
        System.out.println(result);
    }

    public static Map<Character, Integer> characterFrequency(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();

        for (char ch : s.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) +1);
        }
        return freqMap;
    }
}
