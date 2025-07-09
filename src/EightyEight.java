public class EightyEight {
    public static void main(String[] args) {
        // Program 88: Find the second smallest element in the array
        int[] arr = {1,5,3,9,2};
        secondSmallest(arr);
    }

    public static void secondSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int n : arr) {
            if (n < smallest) {
                secondSmallest = smallest;
                smallest = n;
            } else if (secondSmallest > n && smallest != n) {
                secondSmallest = n;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No Second Smallest element");
        } else {
            System.out.println(secondSmallest);
        }
    }
}
