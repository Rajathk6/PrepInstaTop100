import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HundredFifty {
    public static void main(String[] args) {
        // Problem 150: Find All Pairs with Target Sum
        int[] nums = {1, 2, 3, 2, 4};
        int target = 5;
        List<List<Integer>> result = findPairs(nums, target);
        System.out.println(result);
    }

    public static List<List<Integer>> findPairs(int[] nums, int target) {
        Set<String> uniqueKey = new HashSet<>();
        Set<Integer> seen = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();

        for (int num : nums) {
            int other = target - num;
            if (seen.contains(other)) {
                int a = Math.min(other, num);
                int b = Math.max(other, num);

                String key = a + ":" + b;
                if (!uniqueKey.contains(key)) {
                    result.add(Arrays.asList(a,b));
                    uniqueKey.add(key);
                }
            }
            seen.add(num);
        }
        return result;
    }
}
