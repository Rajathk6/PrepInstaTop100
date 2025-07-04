public class SixtyNine {
    public static void main(String[] args) {
        // program 69: count good numbers in a range
        int l = 1000;
        int r = 1020;
        int ans = goodNumberInRange(l, r);
        System.out.println(ans);
    }
    public static int goodNumberInRange(int l, int r) {
        int count = 0;
        for (int i=l; i<=r; i++) {
            String number = Integer.toString(i);
            int len = number.length();

            if (len%2!=0) continue;

            int mid = len/2;
            int leftSum=0, rightSum=0;

            for (int j=0; j<mid; j++) {
                leftSum += number.charAt(j) - '0';
            }

            for (int j=mid; j<len; j++) {
                rightSum += number.charAt(j) - '0';
            }

            if (leftSum == rightSum) count++; 
        }
        return count;
    }
}
