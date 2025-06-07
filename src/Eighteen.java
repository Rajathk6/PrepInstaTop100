public class Eighteen {
    public static void main(String[] args) {
        // Problem 18: Product of Digits of a Number
        int n = 0;
        int ans = productDigit(n);
        System.out.println(ans);
    }

    public static int productDigit(int n) {
        int product = 1;
        if (n == 0) return product = 0;
        n = Math.abs(n);
        while (n!=0) {
            int lastDigit = n%10;
            product*= lastDigit;
            n/=10;
        }
        return product;
    }
}
