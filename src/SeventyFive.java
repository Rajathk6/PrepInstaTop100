public class SeventyFive {
    public static void main(String[] args) {
        // Problem 75: Sort Colors (Dutch National Flag Problem)
        int[] nums = {2, 0, 2, 1, 1, 0, 0};
        sortColors(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static int[] sortColors(int[] nums) {
        int count0 = 0, count1 = 0, count2 = 0;
        for (int count : nums) {
            if (count == 0) count0++;
            else if (count == 1) count1++;
            else count2++;
        }

        int i=0;
        while (count0-- > 0) nums[i++] = 0;
        while (count1-- > 0) nums[i++] = 1;
        while (count2-- > 0) nums[i++] = 2;
        return nums;
    }
}

// OPTIMISED CODE
// public static int[] sortColors(int[] nums) {
//     int low=0, mid=0, high=nums.length-1;

//     while(mid <= high) {
//         if (nums[mid] == 0) {
//             swap(nums, low, mid);
//             mid++;
//             low++;
//         }
//         else if (nums[mid] == 1) mid++;
//         else {
//             swap(nums, mid, high);
//             high--;
//         }
//     }
// }
//     public static void swap(int[] nums, int a, int b) {
//         int temp = a;
//         a = b;
//         b = temp;   
//     }