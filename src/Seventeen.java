public class Seventeen {
    public static void main(String[] args) {
        // Problem 17: Sum of Digits of a Number
        int n = -6;
        int ans = sumDigits(n);
        System.out.println(ans); 
    }

    public static int sumDigits(int n) {
        int sum = 0;
        n = Math.abs(n);
        while (n!=0) {
            int lastDigit = n%10;
            sum += lastDigit;
            n/=10;
        }
        return sum;
    }
}
