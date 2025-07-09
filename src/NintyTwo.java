public class NintyTwo {
    public static void main (String[] args) {
        // Problem 90: N-bit Binary Numbers with More 1’s than 0’s at Every Prefix
        int n = 2;
        generate(n, 0, 0, "");
    }

    public static void generate (int n, int ones, int zeros, String current) {
        if (n == 0) {
            System.out.print(current + " ");
            return;
        }

        generate(n-1, ones+1, zeros, current+"1");

        if (ones>zeros) {
            generate(n-1, ones, zeros+1, current + "0");
        }
    }
}
