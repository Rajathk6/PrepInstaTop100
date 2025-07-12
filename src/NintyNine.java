import java.util.Arrays;

public class NintyNine {
    public static void main(String[] args) {
        // Problem 99: Find Max Scalar Product of Two Vectors
        int[] a = {1,3,5};
        int[] b = {2,4,1};
        int result = maxScalarProduct(a, b);
        System.out.println(result);
    }

    public static int maxScalarProduct(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int max = 0;
        for (int first=0; first<a.length; first++) {
            max += a[first] * b[first];
        }
        return max;
    }
}
