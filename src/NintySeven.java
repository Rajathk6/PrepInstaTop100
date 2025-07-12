import java.util.LinkedHashSet;
import java.util.Set;

public class NintySeven {
    public static void main (String[] args) {
        // Problem 97: Remove Duplicates from an Array
        int[] arr = {7,1,2,2,3,4,3,5,87,34,23,99};
        Set<Integer> result = removeDuplicates(arr);
        System.out.println(result);
    }

    public static Set<Integer> removeDuplicates(int[] arr) {
        Set<Integer> unique = new LinkedHashSet<>(); // for ordered set

        for (int i : arr) unique.add(i);
        
        return unique;
    }
}
