public class HundredTwentyFour {
    public static void main(String[] args) {
        // Problem 124: Remove All Characters from a String Except Alphabets
        String s = "R@j@th123!!";
        String result = extractAlphabets(s);
        System.out.println(result);
    }

    public static String extractAlphabets(String s) {
        StringBuilder str = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) str.append(ch);
        }
        return str.toString();
    }
}
