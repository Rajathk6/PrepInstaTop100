public class HundredTwenty {
    public static void main(String[] args) {
        // Problem 120: Count the Number of Vowels
        String string = "aeIOu";
        int result = countVowels(string);
        System.out.println(result);
    }

    public static int countVowels(String s) {
        int count =0;
        s = s.toLowerCase();
        for (char i: s.toCharArray()) {
            if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
                count++;
            }
        }
        return count;
    }
}
