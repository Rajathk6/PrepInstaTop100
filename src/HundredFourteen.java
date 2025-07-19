import java.util.Stack;

public class HundredFourteen {
    public static void main(String[] args) {
        // Problem 114: Balanced Parenthesis Problem
        String para ="({[]})";
        boolean result = balancedParenthesis(para);
        System.out.println(result);
    }

    public static boolean balancedParenthesis(String p) {
        Stack<Character> stack = new Stack<>();
        for (char c : p.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c==')' && top!='(' || c=='}' && top!='{' || c==']' && top!='[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
