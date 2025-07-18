import java.util.Arrays;

public class HundredTwelve {
    public static void main(String[] args) {
        // Problem 112: Juggling Algorithm for Rotation
        int[] arr = {1,2,3,4,5,6,7};
        int k = 2;

        jugglingAlgo(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    public static void jugglingAlgo(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int gcd = gcd(n, k);

        for (int i=0; i<gcd; i++) {
            int temp = arr[i];
            int j = i;

            while (true) {
                int d = (j+k) % n;
                if (d==i) break;

                arr[j] = arr[d];
                j = d;
            }
            arr[j] = temp;
        }
    }

    public static int gcd(int a, int b) {
        while (b!=0) {
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}
