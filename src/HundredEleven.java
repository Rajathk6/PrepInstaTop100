import java.util.Arrays;

public class HundredEleven {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;

        blockSwapRotate(arr, 0, arr.length, k);
        System.out.println(Arrays.toString(arr)); // Output: [3, 4, 5, 6, 7, 1, 2]
    }

    // Recursive block swap rotation
    public static void blockSwapRotate(int[] arr, int start, int n, int k) {
        if (k == 0 || k == n) return;

        if (k == n - k) {
            swap(arr, start, start + k, k);
            return;
        }

        if (k < n - k) {
            swap(arr, start, start + n - k, k);
            blockSwapRotate(arr, start, n - k, k);
        } else {
            swap(arr, start, start + k, n - k);
            blockSwapRotate(arr, start + n - k, k, 2 * k - n);
        }
    }

    // Swap two blocks of size 'd'
    public static void swap(int[] arr, int i1, int i2, int d) {
        for (int i = 0; i < d; i++) {
            int temp = arr[i1 + i];
            arr[i1 + i] = arr[i2 + i];
            arr[i2 + i] = temp;
        }
    }
}