public class SixtySix {
    public static void main(String[] args) {
        // Problem 66: Given a list arr of N integers, print sums of all subsets
        int[] arr = {1,2};
        printSubsetSum(arr, 0, 0);
    }

    public static void printSubsetSum(int[] arr, int index, int currentSum) {
        if (index == arr.length) {
            System.out.println(currentSum);
            return;
        }

        printSubsetSum(arr, index+1, currentSum+arr[index]);

        printSubsetSum(arr, index+1, currentSum);
    }
}
