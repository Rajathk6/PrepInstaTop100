public class EightySix {
    public static void main (String[] args) {
        // Problem 86: Find the Smallest Element in an Array
        int[] arr = { 1, 5, 3, 9, 12 };
        int result = smallestElement(arr);
        System.out.println(result);
    }

    public static int smallestElement(int[] arr) {
        int smallest = arr[0];

        for (int n : arr) {
            if (smallest > n) smallest = n;
        }
        return smallest;
    }
}
