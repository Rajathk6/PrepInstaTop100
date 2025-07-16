import java.util.HashSet;

public class HundredFour {
    public static void main(String[] args) {
        // Problem 104: Check if One Array Is a Subset of Another
        int[] a = {1,2,3};
        int[] b = {2,4};
        boolean ans = subsetArray(a, b);
        System.out.println(ans);
    }

    public static boolean subsetArray(int[] a, int[] b) {
        HashSet<Integer> subset = new HashSet<>();

        for (int i : a) {
            subset.add(i);
        }

        for (int i : b) {
            if (!subset.contains(i)) {
                return false;
            }
        }
        
        return true;
    }
}
