import java.util.ArrayList;
import java.util.List;

public class SeventySeven {
    public static void main(String[] args){
        // Problem 77: Generate All Combinations of Well-Formed Parentheses
        int n = 1;
        List<String> result = generateParentheses(n);
        System.out.println(result);
    }

    public static List<String>  generateParentheses(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", n, n);
        return result;
    }

    public static void backtrack(List<String> result, String current, int open, int close) {
        // WHEN OPEN AND CLOSE ARE 0 ADD THE CURRENT STRING OF PARENTHESES AND RETURN THE RESULT
        if (open == 0 && close == 0) {
            result.add(current);
            return;
        }
        // IF THERE ARE OPEN PARENTHESES LEFT THEN USE IT AND DECREMENT OPEN
        if (open>0) {
            backtrack(result, current + "(", open-1, close);
        }
        // IF THERE ARE MORE OPEN THEN CLOSE THEN CLOSE THE PARENTHESES AND DECREMENT CLOSE 
        if (close>open) {
            backtrack(result, current + ")", open, close-1);
        }
    }
}
