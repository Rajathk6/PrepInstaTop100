import java.util.Arrays;

public class HundredFourtyEight {
    public static void main(String[] args) {
        // Problem 148: Count Inversions in an Array
        int[] arr = { 5, 4, 3, 2, 1 };
        int result = countInversions(arr);
        System.out.println(result);
    }

    public static int countInversions(int[] arr) {
        if (arr.length<=1) return 0;

        return mergeSortCount(arr,0, arr.length-1);
    }

    private static int mergeSortCount(int[] arr, int left, int right) {
        if (left>=right) return 0;

        int count = 0;
        int mid = left + (right-left)/2;

        count+=mergeSortCount(arr, left, mid);
        count+=mergeSortCount(arr, mid+1, right);
        count+=merge(arr, left, mid, right);

        return count;
    }

    private static int merge(int[] arr, int left, int mid, int right) {
        int[] leftArr = Arrays.copyOfRange(arr, left, mid+1);
        int[] rightArr = Arrays.copyOfRange(arr, mid+1, right+1);

        int i=0,j=0, k= left, swaps=0;

        while (i<leftArr.length && j<rightArr.length) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
                swaps+=leftArr.length-i; // all elements in leftArr[i] which are greater than rightArr[j] will be considered inversion [3,5] [2] (3>2, 5>2) => 2 inversions 
            }
        }

        while (i<leftArr.length) arr[k++] = leftArr[i++];
        while (j<rightArr.length) arr[k++] = rightArr[j++];

        return swaps;
    }
}