public class ThirtyOne {
    public static void main(String[] args) {
        // Problem 31: Highest Common Factor (HCF)
        int a = 40;
        int b = 50;
        int ans = highestCommonFactor(a, b);
        System.out.println(ans);
    }

    public static int highestCommonFactor(int a, int b) {
        if (a==0 && b==0) return 0;
        if (a==0 || b==0) return Math.max(a, b);
        while (b!=0) {
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }

}
