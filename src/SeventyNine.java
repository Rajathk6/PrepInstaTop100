public class SeventyNine {
    public static void main(String[] args) {
        // Problem 79: Calculate the Sum of Elements in an Array
        int[] arr = {1,2,3,4,5};
        int ans = arraySum(arr);
        System.out.println(ans);
    }

    public static int arraySum(int[] arr) {
        int sum = 0;
        
        for (int i=0; i<arr.length; i++) {
            sum+=arr[i];
        }
        // int sum = Arrays.stream(arr).sum();
        return sum;
    }
}
