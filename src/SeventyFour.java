public class SeventyFour {
    public static void main(String[] args) {
        // Problem 74: Maximum Subarray Sum (Kadane’s Algorithm)
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int ans = kadaneAlgo(nums); 
        System.out.println(ans);
    }

    public static int kadaneAlgo(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];
        for (int i=1; i<nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum+nums[i]);
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
        
    }
}
