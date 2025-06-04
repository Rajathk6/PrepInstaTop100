public class One {
    public static void main(String[] args) {
        // Problem 1: Positive or Negative Number
        int num = -435;
        String ans = positiveNegative(num);
        System.out.println(ans);
    }

    public static String positiveNegative(int num) {
        if (num > 0) {
            return "positive";
        } else if (num < 0) {
            return "negative";
        }
        return "zero";
    }
}