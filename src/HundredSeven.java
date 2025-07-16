import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class HundredSeven {
    public static void main(String[] args) {
        // Problem 107: Sort One Array According to the Order of Another
        int[] arr1 = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8};
        int[] arr2 = {2, 1, 8, 3};
        int[] result = sortByOrder(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sortByOrder(int[] arr1, int[] arr2) {
        // step 1: 
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int i : arr1){
            freqMap.put(i, freqMap.getOrDefault(i, 0)+ 1);
        }

        // step 2:
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : arr2) {
            if (freqMap.containsKey(num)) {
                int count = freqMap.get(num);
                for (int i=0; i<count; i++) {
                    result.add(num);
                }
                freqMap.remove(num);
            }
        }

        // step 3:
        ArrayList<Integer> remaining = new ArrayList<>();
        for (int key : freqMap.keySet()) {
            int count = freqMap.get(key);
            for (int i=0; i<count; i++) {
                remaining.add(key);
            }
        }

        // step 4:
        Collections.sort(remaining);
        result.addAll(remaining);

        // step 5:
        int[] sortedArray = new int[arr1.length];
        int j = 0;
        for (int i : result) {
            sortedArray[j++] = i;
        }
        return sortedArray;
    }
}
