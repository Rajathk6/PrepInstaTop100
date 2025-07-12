public class Hundred {
    public static void main(String[] args) {
        // Problem 100: Count Even and Odd Elements in an Array
        int[] arr = {2,1,3,4,5,6,7,8};
        evenOddCount(arr);
    }

    public static void evenOddCount (int[] arr) {
        int evenCount = 0;
        int oddCount = 0;

        for (int i : arr) {
            if (i%2==0) evenCount++;
            else oddCount++;
        }

        System.out.println("Even Count: "+evenCount);
        System.out.println("Odd Count: "+oddCount);
    }
}
