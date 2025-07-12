import java.util.Arrays;

public class NintyEight {
    public static void main(String[] args) {
        // Problem 98: Find Min Scalar Product of Two Vectors
        int[] a = {1,3,5};
        int[] b = {2,4,1};
        int result = minScalarProduct(a, b);
        System.out.println(result);
    }

    public static int minScalarProduct(int[] a, int[]  b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int sum = 0;
        for (int first=0; first<a.length; first++) {
            int second = b.length-1-first;
            sum+= a[first] * b[second];
        }
        return sum;
    }
}
