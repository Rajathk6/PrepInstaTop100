public class HundredTwentyEight {
    public static void main(String[] args) {
        // Problem 128: Capitalize the First and Last Character of Each Word in a String
        String s = "hello world test a code";
        String result = capitalizeEnds(s);
        System.out.println(result);
    }

    public static String capitalizeEnds(String s) {
        String[] words = s.split(" ");
        StringBuilder str = new StringBuilder();
        for (String word : words) {
            int len = word.length();

            if (len == 0)
                continue;
            else if (len == 1) {
                str.append(Character.toUpperCase(word.charAt(0)));
            } else {
                char first = Character.toUpperCase(word.charAt(0));
                String middle = word.substring(1, len - 1);
                char last = Character.toUpperCase(word.charAt(len - 1));
                str.append(first)
                        .append(middle)
                        .append(last);
            }
            str.append(" ");
        }
        return str.toString().trim();
    }
}
