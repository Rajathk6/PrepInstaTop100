public class HundredTwo {
    public static void main(String[] args) {
        // Problem 102: Find Max Product Sub-array
        int[] arr = {2,3,-2,4};
        int result = maxProduct(arr);
        System.out.println(result);
    }

    public static int maxProduct(int[] arr) {
        //modified kadene's approach
        int maxSoFar = arr[0];
        int minSoFar = arr[0];
        int result = arr[0];

        for (int i=1; i<arr.length; i++) {
            int current = arr[i];

            int temp = maxSoFar;
            maxSoFar = Math.max(current, Math.max(current*maxSoFar, current*minSoFar));
            minSoFar = Math.min(current, Math.min(current*temp, current*minSoFar));
            result = Math.max(result, maxSoFar);
        }
        return result;
    }
}
