public class Three {
    public static void main(String[] args) {
        // Problem 3: Sum of First N Natural Numbers
        long n = 1000000;
        long ans = sumOfNNaturalNumbers(n);
        System.out.println(ans);
    }
    public static long sumOfNNaturalNumbers(long n) {
        long sum = 1;
        
        for (long digit=2; digit<=n; digit++) {
            sum+=digit;
        }
        return sum;
    }
}


// OPTIMISED SOLUTION O(1)O(1)

// return n*(n+1)/2; 