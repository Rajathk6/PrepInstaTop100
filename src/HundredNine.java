public class HundredNine {
    public static void main(String[] args) {
        //  Problem 109: Find Equilibrium Index of Array
        int[] arr = {-7,1,5,2,-4,3,0};
        int result = equilibriumArray(arr);
        System.out.println(result);
    }

    public static int equilibriumArray(int[] arr) {
        int totalSum = 0;
        int leftSum = 0;

        for (int i : arr) {
            totalSum+=i;
        }

        for (int i=0; i<arr.length; i++) {
            int rightSum = totalSum - leftSum - arr[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum+=arr[i];
        }
        return -1;
    }
}
