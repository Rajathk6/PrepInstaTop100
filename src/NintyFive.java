import java.util.ArrayList;
import java.util.List;

public class NintyFive {
    public static void main(String[] args) {
        // Problem 95: Find Repeating Elements in an Array
        int[] arr = {1,2,3,4};
        List<Integer> result = repeatingElements(arr);
        System.out.println(result);
    }

    public static List<Integer> repeatingElements(int[] arr) {
        ArrayList<Integer> store = new ArrayList<>();
        ArrayList<Integer> duplicate = new ArrayList<>();

        for (int i=0; i<arr.length; i++) {
            if (!store.contains(arr[i])) {
                store.add(arr[i]);
            } else if (store.contains(arr[i]) && !duplicate.contains(arr[i])){
                duplicate.add(arr[i]);
            }
        }
        return duplicate;
    }
}

    // public static Set<Integer> repeatingElements(int[] arr) {
    //     Set<Integer> seen = new HashSet<>();
    //     Set<Integer> duplicate = new HashSet<>();

    //     for (int i : arr) {
    //         if (!seen.contains(i)) {
    //             duplicate.add(i);
    //         }
    //     }
    //     return duplicate;
    // }

    // public static List<Integer> findDuplicates(int[] arr) {
    //     Map<Integer, Integer> freq = new HashMap<>();
    //     List<Integer> result = new ArrayList<>();

    //     for (int num : arr) {
    //         freq.put(num, freq.getOrDefault(num, 0) + 1);
    //     }

    //     for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
    //         if (entry.getValue() > 1) {
    //             result.add(entry.getKey());
    //         }
    //     }

    //     return result;
    // }
