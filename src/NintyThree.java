import java.util.ArrayList;
import java.util.List;

public class NintyThree {
    public static void main(String[] args) {
        // Problem 93: Find All Subsets of a Set of Positive Integers
        int[] arr = {1,2};
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        subsetSet(arr, 0, current, result);

        for (List<Integer> subset : result) {
            System.out.print(subset);
        }
    }

    public static void subsetSet(int[] arr, int index, List<Integer> current, List<List<Integer>> result) {
        if (index == arr.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(arr[index]);
        subsetSet(arr, index+1, current, result);

        current.remove(current.size()-1);
        subsetSet(arr, index+1, current, result);
    }
}
