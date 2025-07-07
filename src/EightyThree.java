import java.util.HashMap;

public class EightyThree {
    public static void main(String[] args) {
        // Problem 83: Frequency of Elements in an Array
        int[] arr = {0, 0, 0, 0, 0, 0, 0};
        freqElements(arr);
    }

    public static void freqElements(int[] arr) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int n : arr) {
            freqMap.put(n, freqMap.getOrDefault(n, 0) + 1);
        }

        for (int key : freqMap.keySet()) {
            System.out.println(key + " : " + freqMap.get(key));
        }
    }
}
