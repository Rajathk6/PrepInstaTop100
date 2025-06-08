public class TwentySeven {
    public static void main(String[] args) {
        // Problem 27: Check Whether a Number is a Sunny Number
        int n = 24;
        String ans = sunnyNumber(n);
        System.out.println(ans);
    }

    public static String sunnyNumber(int n) {
        int nextNumber = n+1;
        int sqrtNextNumber = (int)Math.sqrt(nextNumber);
        if (n<0) return "Not a Sunny Number";
        return sqrtNextNumber * sqrtNextNumber == nextNumber ? "Sunny Number" : "Not a Sunny Number";
    }
}
