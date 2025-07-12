import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NintySix {
    public static void main (String[] args) {
        // Problem 96: Find Non-Repeating Elements in an Array
        int[] arr = {1,2,2,3,3,3,4,4,5};
        List<Integer> result = nonReapeatingElement(arr);
        System.out.println(result);
    }

    public static List<Integer> nonReapeatingElement (int[] arr) {
        HashMap<Integer, Integer> unique = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int i : arr) {
            unique.put(i, unique.getOrDefault(i, 0)+1);       
        }

        for (Map.Entry<Integer,Integer> entry : unique.entrySet()) {
            if (entry.getValue() == 1) {
                result.add(entry.getKey());
            }
        }

        return result;
    }
}
