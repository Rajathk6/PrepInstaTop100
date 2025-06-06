import java.util.ArrayList;
import java.util.Arrays;

public class Eleven {
    public static void main(String[] args) {
        // Problem 11: Print All Factors of a Number
            int n = 100;
            int[] result = factorOfNumber(n);
            System.out.println(Arrays.toString(result));
    }

    public static int[] factorOfNumber(int n) {
        ArrayList<Integer> factors = new ArrayList<>();

        for (int i=1; i<=n; i++) {
            if (isFactor(n, i)) {
                factors.add(i);
            }
        }
        

        int[] result = new int[factors.size()];
        for (int i=0; i<result.length; i++) {
            result[i] = factors.get(i);
        }
        return result;
    }

    public static boolean isFactor(int n, int fact) {
        if (n==0) return false;
        if (n==1) return true;

        for (int i=2; i<=n; i++) {
            if (n%fact!=0) {
                return false;
            }
        }
        return true;
    }
}



// OPTIMISED CODE

//     public static int[] factorOfNumber(int n) {
//         ArrayList<Integer> factors = new ArrayList<>();

//         for (int i=1; i<=n; i++) {
//             if (n%i==0) {
//                 factors.add(i);
//                 if (i != n/i) {
//                     factors.add(n/i);
//                 }
//             }
//         }

//         factors.sort(Integer::compareTo);
        

//         int[] result = new int[factors.size()];
//         for (int i=0; i<result.length; i++) {
//             result[i] = factors.get(i);
//         }
//         return result;
//     }