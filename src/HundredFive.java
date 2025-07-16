public class HundredFive {
    public static void main(String[] args) {
        // Problem 105: Can All Numbers of Array Be Made Equal
        int[] arr = {6, 12, 5};
        boolean result = equalArray(arr);
        System.out.println(result);
    }

    public static boolean equalArray(int[] arr) {
        int gcd = arr[0];

        for (int i : arr) {
            gcd = findGCD(gcd, i);
        }
        return gcd>0;
    }

    public static int findGCD(int a, int b) {
        while (b!=0) {
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}
