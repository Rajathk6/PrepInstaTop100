public class HundredTwentyFive {
    public static void main(String[] args) {
        // Problem 125: Remove Spaces from a String
        String s = "Hello World 123";
        String result = removeSpaces(s);
        System.out.println(result);
    }

    public static String removeSpaces(String s) {
        StringBuilder str = new StringBuilder();
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) != ' ') {
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}

    // public static String removeSpaces(String s) {
    //     StringBuilder str = new StringBuilder();
    //     for (char ch : s.toCharArray()) {
    //         if (ch != ' ') {
    //             str.append(ch);
    //         }
    //     }
    //     return str.toString();
    // }

    // public static String removeSpaces(String s) {
    //     StringBuilder str = new StringBuilder();
    //     for (char ch : s.toCharArray()) {
    //         if (!Character.isWhitespace(ch)) {
    //             str.append(ch);
    //         }
    //     }
    //     return str.toString();
    // }