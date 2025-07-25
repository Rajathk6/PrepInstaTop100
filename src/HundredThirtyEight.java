import java.util.Arrays;

public class HundredThirtyEight {
    public static void main(String[] args) {
        // Problem 138: Sort an Array Consisting of Only 0, 1, and 2 Without Using Any Sorting Algorithm
        // Dutch National Flag Algorithm
        int[] nums = {2,0,2,1,0,2,1};
        int result[] = sortArray(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sortArray(int[] nums) {
        int low = 0, mid = 0, high = nums.length-1;

        while (mid <= high) {
            switch(nums[mid]) {
                case 0 : 
                    swap(nums, low, mid);
                    low++;
                    mid++;
                    break;
                case 1 :
                    mid++;
                    break;
                case 2:
                    swap(nums, mid, high);
                    high--;
                    break;
            }
        }
        return nums;
    }

    private static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
