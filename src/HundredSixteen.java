public class HundredSixteen {
    public static void main(String[] args) {
        // Problem 116: Check Whether a Character Is an Alphabet or Not
        char ch = 'o';
        boolean result = alphabetOrNot(ch);
        System.out.println(result);
    }

    public static boolean alphabetOrNot(char ch) {
       return Character.isLetter(ch);
    }
}
