public class EightySeven {
    public static void main(String[] args) {
        // Problem 87: Find the Second Largest Element in an Array
        int[] arr = {1, 5, 5, 5, 5};
        secondLargestElement(arr);
    }

    public static void secondLargestElement(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int n : arr) {
            if (n > largest)  {
                secondLargest = largest;
                largest = n;
            } else if (secondLargest < n && n != largest) {
                secondLargest = n;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No Second Largest Element");
        } else {
            System.out.println(secondLargest);
        }
    }
}
