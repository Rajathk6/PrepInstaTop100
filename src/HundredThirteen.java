import java.util.Arrays;

public class HundredThirteen {
    public static void main(String[] args) {
        // Problem 113: Circular Rotation of an Array by K Positions
        int[] arr = {1,2,3,4,5};
        int k = 2;
        int[] left = leftRotate(arr, k);
        int[] right = rightRotate(arr, k);
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
    }

    public static int[] leftRotate(int[] arr, int k) {
        int n = arr.length;
        int[] rotated = new int[n];
        k = k%n;
        for (int i=0; i<n; i++) {
            rotated[i] = arr[(i+k)%n];
        }
        return rotated;
    }

    public static int[] rightRotate(int[] arr, int k) {
        int n = arr.length;
        int[] rotated = new int[n];
        k = k%n;
        for (int i=0; i<n; i++) {
            rotated[i] = arr[(i-k+n)%n];
        }
        return rotated;
    }
}
