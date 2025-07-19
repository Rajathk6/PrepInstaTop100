public class HundredNineteen {
    public static void main(String[] args) {
        // Problem 119: Toggle Each Character in a String
        String toggle = "HeLlo@1234_ ";
        String result = toggleCharacter(toggle);
        System.out.println(result);
    }

    public static String toggleCharacter(String toggle) {
        String result = "";
        for (char ch : toggle.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                ch = Character.toUpperCase(ch);
            } else if (Character.isUpperCase(ch)){
                ch = Character.toLowerCase(ch);
            }
            result += ch;
        }
        return result;
    }
}
