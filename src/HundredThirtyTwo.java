public class HundredThirtyTwo {
    public static void main(String[] args) {
        // Problem 132: Replace a substring in a string
        String s = "the cat chased the mouse";  
        String target = "cat";  
        String replacement = "dog";
        String result = replaceSubstring(s, target, replacement);
        System.out.println(result);
    }

    public static String replaceSubstring(String s, String target, String replacement) {
        String[] str = s.split(" ");
        StringBuilder change = new StringBuilder();

        for (int i=0; i<=str.length-1; i++) {
            if (str[i].equals(target)) {
               str[i] = replacement; 
            }
        }
        for (String ch : str) {
            change.append(ch);
            change.append(" ");
        }
        return change.toString().trim();
    }
}
