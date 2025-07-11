import java.util.ArrayList;
import java.util.List;

public class NintyFour {
    public static void main(String[] args) {
        // Problem 94: Remove All Adjacent Duplicate Characters Recursively
        String s = "azxxzy";
        String result = duplicateCharacter(s);
        System.out.println(result);
    }

    public static String duplicateCharacter (String s) {
        int i = 0;
        StringBuilder sb = new StringBuilder();

        while (i < s.length()) {
            int j = i;

            if (j+1 < s.length() && s.charAt(j) == s.charAt(j+1)) {
                j++;
            }

            if (j==i) {
                sb.append(s.charAt(i));
            }
            i = j+1;
        }

        if (s.length() == sb.length()) {
            return sb.toString();
        }
        return duplicateCharacter(sb.toString());
    }
}
