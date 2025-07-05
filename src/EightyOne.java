import java.util.Arrays;

public class EightyOne {
    public static void main(String[] args) {
        //  Problem 81: Sort First Half Ascending, Second Half Descending
        int[] arr = {5,2,9,1,7,6};
        sortArrays(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortArrays(int[] arr) {
        int n = arr.length;
        int mid = (n%2 == 0) ? n/2 : n/2+1;
        Arrays.sort(arr, 0, mid);
        Arrays.sort(arr, mid, n);

        int left = mid, right = n-1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            right--;
            left++;
        }

    }
}
