public class HundredTwentySix {
    public static void main(String[] args) {
        // Problem 126: Remove Brackets from an Algebraic Expression
        String s = "{(a+b)*[c+d]}";
        String result = removeBrackets(s);
        System.out.println(result);
    }

    public static String removeBrackets(String s) {
        StringBuilder str = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if ("(){}[]".indexOf(ch) == -1) {
                str.append(ch);
            }
        }
        return str.toString();
    }
}
