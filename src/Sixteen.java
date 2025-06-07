public class Sixteen {
    public static void main(String[] args) {
        // Problem 16: Count the Number of Digits in an Integer
        int n = -53410000;
        int ans = countDigits(n);
        System.out.println(ans);
    }

    public static int countDigits(int n) {
        int count = 0;
        if (n == 0) {
            return count=1;
        }
        
        while (n!=0) {
            count++;
            n/=10;
        }
        return count;
    }

    // public static int countDigits(int n) {
    //     int count = 0;
    //     if (n == 0) {
    //         return count=1;
    //     }
        
    //     while (n!=0) {
    //         count++;
    //         n/=10;
    //     }
    //     return count;
    // }
}
