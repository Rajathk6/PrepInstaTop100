public class EightyNine {
    public static void main(String[] args) {
        // Problem 89: Find Longest Palindrome in an Array
        String[] elements = {"121", "1331", "madm", "1245", "123456"};
        String ans = longestPalindrome(elements);
        System.out.println(ans);
    }

    public static String longestPalindrome(String[] elements) {
        int longest  = 0;
        int index = -1;
        for (int i=0; i<elements.length; i++) {
            String element = elements[i];
            if (isPalindrome(element)) {
                if (element.length() > longest) {
                    longest = element.length();
                    index = i;
                }
            }
        }
        return index == -1 ? "No Palindrome found" :elements[index];
    }

    public static boolean isPalindrome(String s) {
        int first = 0;
        int last = s.length()-1;
        while (first < last) {
            if (s.charAt(first) != s.charAt(last)) {
                return false;
            }
            last--;
            first++;
        }
        return true;
    }
}   
