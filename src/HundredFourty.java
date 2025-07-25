import java.util.Arrays;

public class HundredFourty {
    public static void main(String[] args) {
        // Problem 140: Move All Negative Elements to One Side of the Array
        int[] nums = {1, -2, 3, -4, 5, -6};
        int[] result = moveNegative(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] moveNegative(int[] nums) {
        int first = 0;
        int last = nums.length-1;

        while (first <= last) {
            if (nums[first] < 0) {
                first++;
            } else if (nums[last] >= 0) {
                last--;
            } else {
                swap(nums, first, last);
                first++;
                last--;
            }
        }
        return nums;
    }
    private static void swap(int[] nums, int first, int last) {
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
    }
}
