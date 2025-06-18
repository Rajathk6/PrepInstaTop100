public class SixtyFive {
    public static void main(String[] args) {
        // Program 65: Print F(N)th Term of a Fibonacci-like Sequence
        int first = 3, second = 5, n = 6;
        int ans = termInFibonacci(first, second, n);
        System.out.println(ans);
    }

    public static int termInFibonacci(int first, int second, int n) {
        int[] arr = new int[n];
        arr[0] = first;
        arr[1] = second; 
        for (int i=2; i<=n-1; i++) {
            arr[i] = arr[i-2] + arr[i-1];
        }
        return arr[n-1];
    }

}


// OPTIMISED CODE 
    // public static int termInFibonacci(int first, int second, int n) {
    //     int a = first, b = second, c = 0;

    //     for (int i=3; i<=n; i++) {
    //         c = a+b;
    //         a = b;
    //         b = c;
    //     }
    //     return c;
    // }

    // USING RECURSION

    //  public static int termInFibonacci(int first, int second, int n) {
    //     if (n==1) return first;
    //     if (n==2) return second;
    //     int a = first, b = second, c = 0;
    //     c = a + b;
    //     return termInFibonacci(b, c, n-1);
    // }