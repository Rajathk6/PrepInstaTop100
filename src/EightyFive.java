public class EightyFive {
    public static void main(String[] args) {
        // Problem 85: Find the Largest Element in an Array
        int[] arr = { 1, 5, 3, 9, 12 };
        int ans = largestElement(arr);
        System.out.println(ans);
    }

    public static int largestElement(int[] arr) {
        int largest = arr[0];
        for (int n : arr) {
            if (n > largest) largest = n;
        }
        return largest;
    }
}
