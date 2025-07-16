import java.util.HashSet;

public class HundredThree {
    public static void main(String[] args) {
        // Problem 103: Check if Arrays Are Disjoint
        int[] a = {1,2,3,3,4};
        int[] b = {5,6,7,7,3};
        boolean ans = disjointArray(a, b);
        System.out.println(ans);
    }

    public static boolean disjointArray(int[] a, int[] b) {
        HashSet<Integer> unique = new HashSet<>();

        for(int i : a) {
            unique.add(i);
        }

        for (int i : b) {
            if (unique.contains(i)) {
                return false;
            }
        }
        return true;
    }

}
