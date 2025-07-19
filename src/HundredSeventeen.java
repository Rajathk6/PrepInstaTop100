public class HundredSeventeen {
    public static void main(String[] args) {
        // Problem 117: Find the ASCII Value of a Character
        char ch = 's';
        int result = asciiValue(ch);
        System.out.println(result);
    }

    public static int asciiValue(char ch) {
        return (int)ch;
    }
}

// return Character.valueOf(ch);