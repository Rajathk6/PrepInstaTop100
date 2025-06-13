public class FortyThree {
    public static void main(String[] args) {
        // Problem 43: Number of Permutations (nPr)
        int n = 5;
        int r = 10;
        int ans = numberOfPermutation(n, r);
        System.out.println(ans);
    }

    public static int numberOfPermutation(int n, int r) {
        int difference = n-r+1;
        int result = 1;
        for (int i=difference; i<=n; i++) {
            result*=i;
        }
        return result;
    }
}
