import java.util.*;

public class HundredFourtyOne {
    public static void main(String[] args) {
        // Problem 141: Find the Union and Intersection of Two Sorted Arrays
        int[] arr1 = { 1, 2, 4, 5, 6 };
        int[] arr2 = { 2, 3, 5, 7 };
        int[] union = unionArray(arr1, arr2);
        int[] intersection = intersectionArray(arr1, arr2);
        System.out.println(Arrays.toString(union));
        System.out.println(Arrays.toString(intersection));
    }

    public static int[] unionArray(int[] arr1, int[] arr2) {
        List<Integer> union = new ArrayList<>();
        int i=0, j=0;

        while (i<arr1.length && j <arr2.length) {
            if (arr1[i] < arr2[j]) {
                union.add(arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                union.add(arr2[j]);
                j++;
            } else {
                union.add(arr1[i]);
                i++;
                j++;
            }
        }  
        while (i<arr1.length) union.add(arr1[i++]);
        while (j<arr2.length) union.add(arr2[j++]);
        
        int[] result = new int[union.size()];

        for (int k=0; k<union.size(); k++) {
            result[k] = union.get(k);
        }
        return result;
    }

    public static int[] intersectionArray(int[] arr1, int[] arr2) {
        List<Integer> inter = new ArrayList<>();
        int i=0, j=0;

        while (i<arr1.length && j<arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                inter.add(arr1[i]);
                i++;
                j++;
            }
        }

        int[] result = new int[inter.size()];
        for (int k=0; k<inter.size(); k++) {
            result[k] = inter.get(k);
        }
        return result;
    }
}
