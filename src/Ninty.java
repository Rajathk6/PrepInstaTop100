import java.util.HashSet;

public class Ninty {
    public static void main(String[] args) {
        // Problem 90: Count Distinct Elements in an Array
        int[] arr = { 1, 2, 2, 2, 4, 4, 4 };
        int ans = countDistinct(arr);
        System.out.println(ans);
    }

    public static int countDistinct(int[] arr) {
        HashSet<Integer> unique = new HashSet<>();
        for (int i : arr) {
            unique.add(i);
        }
        return unique.size();
    }
}
