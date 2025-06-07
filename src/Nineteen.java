public class Nineteen {
    public static void main(String[] args) {
        // Problem 19: Check if a Number is a Perfect Number
        int n = 4;
        String ans = perfectNumber(n);
        System.out.println(ans);
    }

    public static String perfectNumber(int n) {
        if (n<=1) return "Not a perfect number";
        int sum = 0;

        for (int i=1; i<=n/2; i++) {
            if (n%i == 0) {
                sum+=i;
            }
        }
        return sum==n ? "Perfect Number" : "not a perfect number";  
    }
}

// OPTIMISED CODE O(sqrt n)

//     public static String perfectNumber(int n) {
//         if (n<=1) return "Not a perfect number";
//         int sum = 0;
//         int sqrtN = (int)Math.sqrt(n);
//         for (int i=1; i<=sqrtN; i++) {
//             if (n%i == 0) {
//                 sum+=i;
//                 int otherdivisor = n/i;
//                 if (otherdivisor!=i) {
//                     sum+=n/i;
//                 }
//             }
//         }
//         return sum==n ? "Perfect Number" : "not a perfect number";  
//     }