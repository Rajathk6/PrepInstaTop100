import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class EightyFour {
    public static void main(String[] args) {
        // Problem 84: Sort Elements by Frequency
        int[] arr = {4, 6, 2, 4, 3, 4, 6, 2};
        int[] result = sortByFrequency(arr); 
        System.out.println(Arrays.toString(result));
    }

    public static int[] sortByFrequency(int[] arr) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        HashMap<Integer, Integer> firstOccurance = new HashMap<>();

        // 1. count the frequency and add it to list, use another freqency to find the first occurance
        for (int i=0; i<arr.length; i++) {
            int n = arr[i];
            freqMap.put(n, freqMap.getOrDefault(n, 0)+1);
            if (!firstOccurance.containsKey(n)) {
                firstOccurance.put(n, i);
            }
        }

        // 2. add the array to list
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        // 3. sort elements according to its frequency
        list.sort((a,b) -> {
            int freqA  = freqMap.get(a);
            int freqB = freqMap.get(b);
            if (freqA != freqB) {
                return freqB - freqA;
            } else {
                return firstOccurance.get(a) - firstOccurance.get(b);
            }
        });

        // 4. convert it back to array to print it
        int[] result = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            result[i] =  list.get(i);
        }
        return result;
    }
}
