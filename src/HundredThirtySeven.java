public class HundredThirtySeven {
    public static void main(String[] args) {
        // Program 137: Reverse letters in a string
        String s = "a-bC-dEf-ghIj";
        String result = reverseOnlyLetters(s);
        System.out.println(result);
    }

    public static String reverseOnlyLetters(String s) {
        char[] word = s.toCharArray();
        int first = 0;
        int last = word.length-1;
        

        while (first < last) {
            if (Character.isAlphabetic(word[first]) && Character.isAlphabetic(word[last])) {
                char temp = word[first];
                word[first] = word[last];
                word[last] = temp;
                first++;
                last--;
            } else if (!Character.isAlphabetic(word[first]) && Character.isAlphabetic(word[last])) {
                first++;
            } else {
                last--;
            }
        }
        
        return new String(word);
    }
}
