public class ThirtyTwo {
    public static void main(String[] args) {
        // Problem 32: Lowest Common Multiple (LCM) 
        int a = 20;
        int b = 30;
        int ans = lowestCommonMultiple(a, b);
        System.out.println(ans);
    }

    public static int lowestCommonMultiple(int a, int b) {
        // O(a * b)
        int result = Integer.MAX_VALUE;

        if (a==0 || b==0) return 0;

        for (int i=1; i<=a*b; i++) {
            if (i%a==0 && i%b==0) {
                result = Math.min(result, i);
            }
        }
        return result;
    }
}


// EUCLID'S ALGORITHM O(log(min(a, b)))


    // public static int lowestCommonMultiple(int a, int b) {
    //     if (a==0 || b==0) return 0;
    //     return (a*b) / gcd(a, b);
    // }

    // public static int gcd(int a, int b) {
    //     while (b!=0) {
    //         int temp = b;
    //         b = a%b;
    //         a = temp;
    //     }
    //     return a;
    // }

