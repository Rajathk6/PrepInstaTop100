public class Thirteen {
    public static void main(String[] args) {
        // Problem 13: Palindrome Number
        int n = 0;
        String ans = palindromeNumber(n);
        System.out.println(ans);
    }

    public static String palindromeNumber(int n) {
        int value = n;
        int result = 0;
        if (n<0) return "Not Palindrome";
        while (value!=0) {
            int lastDigit = value%10;
            result = result * 10 + lastDigit;
            value = value/10;   
        }
        return result==n ? "Palindrome" : "Not Palindrome"; 
    }
}
