public class HundredFourtyTwo {
    public static void main(String[] args) {
        // problem 142: Find the Largest Sum Contiguous Subarray
        int[] num = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = largestSubarraySum(num);
        System.out.println(result);
    }

    public static int largestSubarraySum(int[] num) {
        int currentSum = num[0];
        int maxSum = num[0];

        for (int i : num) {
            currentSum = Math.max(currentSum+i, i);
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }
}
