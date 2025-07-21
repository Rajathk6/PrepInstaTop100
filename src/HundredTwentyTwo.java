public class HundredTwentyTwo {
    public static void main(String[] args) {
        String name = "aab34556cdcbaa1";
        boolean result = isPalindrome(name);
        System.out.println(result);
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int last = s.length()-1;
        int mid = s.length()/2;
        for (int first=0; first<mid; first++) {
            if (Character.isLetter(s.charAt(first)) && Character.isLetter(s.charAt(last))) {
                if (s.charAt(first) != s.charAt(last)) {
                    return false;
                }
                last--;
            }
            
        }
        return true;
    }
}
