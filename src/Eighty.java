import java.util.Arrays;

public class Eighty {
    public static void main(String[] args) {
        // Problem 80: Reverse an Array
        int[] arr = {1,2,3,4,5};
        int[] ans = reverseArray(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] reverseArray(int[] arr) {
        int left = 0, right = arr.length-1;
        while (left<right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            right--;
            left++;
        }
        return arr;
    }
}