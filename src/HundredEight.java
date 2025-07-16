import java.util.Arrays;
import java.util.HashMap;

public class HundredEight {
    public static void main(String[] args) {
        // Problem 108: Replace Each Element by Its Rank in Array
        int[] arr = {20,15,26,15,30};
        int[] result = rankArray(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] rankArray(int[] arr) {
        HashMap<Integer, Integer> rankMap = new HashMap<>();

        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        int rank = 1;
        for (int  i : copy) {
            if (!rankMap.containsKey(i)) {
                rankMap.put(i, rank++);
            }
        }  

        int[] result = new int[arr.length];
        for (int i=0; i<arr.length; i++) {
            result[i] = rankMap.get(arr[i]);
        }
        return result;
    }
}
