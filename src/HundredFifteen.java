public class HundredFifteen {
    public static void main(String[] args) {
        //  Problem 115: Check Whether a Character Is a Vowel or Consonant
        char ch  = '=';
        String result = vowelConsonant(ch);
        System.out.println(result);
    }

    public static String vowelConsonant(char ch) {
        ch = Character.toLowerCase(ch);

        if (!Character.isLetter(ch)) return "Not a Letter";

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return "Vowel";
        else return "Consonant";
    }
}
