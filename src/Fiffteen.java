public class Fiffteen {
    public static void main(String[] args) {
        // Problem 15: Find the Frequency of Digits in a Number
        int n = -234;
        frequencyOfNumber(n);
    }

    public static void frequencyOfNumber(int n) {
        int[] freq = new int[10];
        int lastDigit = 0;
        if (n == 0) {
            freq[0] = 1;
        }

        while (n>0) {
            lastDigit = n%10;
            freq[lastDigit]++;
            n/=10;
        }

        for (int i=0; i<10; i++) {
            if (freq[i] > 0) {
                System.out.println(i + "->" + freq[i] + "times");
            }
        }
    }
}
