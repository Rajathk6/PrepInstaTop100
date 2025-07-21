public class HundredTwentySeven {
    public static void main(String[] args) {
        // Problem 127: Count the Sum of Numbers in a String
        String s = "R1a2j@3";
        int result = sumOfDigitsInString(s);
        System.out.println(result);
    }
    
    public static int sumOfDigitsInString(String s) {
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                count+=(ch-'0'); //ch-48    '0' -> 48
            }
        }
        return count;
    }
}
