public class Five {
    public static void main(String[] args) {
        // Problem 5: Sum of Numbers in a Given Range
        long start = 1;
        long end = 1000000;
        long ans = sumNumbersInRange(start, end);
        System.out.println(ans);
    }

    public static long sumNumbersInRange(long start, long end) {
        long sum = 0;
        if (start > end) return -1;
        while (start <= end) {
            sum+=start;
            start++;
        }
        return sum;
    }
}


// OPTIMISED SOLUTION

// long count = end - start + 1;
// return (count*(start+end))/2