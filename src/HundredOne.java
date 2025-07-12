import java.util.HashMap;
import java.util.Map;

public class HundredOne {
    public static void main(String[] args) {
        // Problem 101: Find All Symmetric Pairs in an Array
        int[][] pairs = {
            {1, 2},
            {3, 4},
            {2, 1},
            {4, 3},
            {5, 6}
        };

        findSymmetricPairs(pairs);
    }

    public static void findSymmetricPairs(int[][] pairs) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] pair : pairs) {
            int a = pair[0];
            int b = pair[1];

            if (map.containsKey(b) && map.get(b) == a) {
                System.out.println("[" + a + ", " + b + "]");
            } else {
                map.put(a, b);
            }
        }

    }
}
