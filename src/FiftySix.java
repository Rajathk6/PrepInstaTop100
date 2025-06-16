public class FiftySix {
    public static void main(String[] args) {
        // Problem 56: Power of a Number using Recursion
        int base = 2, power = 4;
        int ans = powerOfNumber(base, power);
        System.out.println(ans);
    }

    public static int powerOfNumber(int base, int power) {
        if (power == 0) return 1;
        return base*powerOfNumber(base, power-1);
    }
}
