public class Thirty {
    public static void main(String[] args) {
        // Problem 30: Check Whether a Number is a Palindrome Number
        int n = 1001;
        String ans = palindromeNumber(n);
        System.out.println(ans);
    }

    public static String palindromeNumber(int n) {
        int reversedNumber = 0;
        int temp = n;
        
        if (n==0) return "Palindrome Number";
        if (n<0) return "Not a Palindrome Number";

        while (temp!=0) {
            int lastDigit = temp%10;
            reversedNumber = reversedNumber*10 + lastDigit;
            temp/=10;
        }
        return (n == reversedNumber) ? "Palindrome Number" : "Not a Palindrome Number";
    }
}
