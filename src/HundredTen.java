import java.util.Arrays;

public class HundredTen {
    public static void main(String[] args) {
        // Problem 110: Left and Right Rotation of Array
        int[] arr = {1,2,3,4,5};
        int k = 2;
        int[] left = leftRotate(arr, k);
        int[] right = rightRotate(arr, k);
        System.out.println("left Rotation: "+Arrays.toString(left));
        System.out.println("right rotation: "+Arrays.toString(right));
    }

    public static int[] leftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k%n;
        int[] rotated = new int[n];

        for (int i=0; i<n; i++) {
            rotated[i] = arr[(i+k) % n];
        }
        return rotated;
    }

    public static int[] rightRotate(int[] arr, int k) {
        int n = arr.length;
        k = k%n;
        int rotated[] = new int[n];

        for (int i=0; i<n; i++) {
            rotated[i] = arr[(i-k + n)%n];
        }
        return rotated;
    }
}
