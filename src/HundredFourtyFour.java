public class HundredFourtyFour {
    public static void main(String[] args) {
        // Problem 144: Minimum Number of Jumps to Reach the End
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int result = minimumNumberJump(arr);
        System.out.println(result);
    }

    public static int minimumNumberJump(int[] arr) {
        int farthest = 0, end = 0, jumps = 0;
        if (arr.length==0) return -1;
        if (arr.length==1) return 0;

        for (int i=0; i<arr.length-1; i++) {
            farthest = Math.max(farthest, i+arr[i]);

            if (i==end) {
                jumps++;
                end = farthest;
                if (i>=arr.length-1) break;
            }
        }
        return end>=arr.length-1? jumps : -1;
    }
}
