public class HundredTwentyOne {
    public static void main(String[] args) {
        // Problem 121: Remove the Vowels from a String
        String s = "Rajathu";
        String result = removeVowels(s);
        System.out.println(result);
    }

    public static String removeVowels(String s) {
        s = s.toLowerCase();
        StringBuilder str = new StringBuilder();
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u') {
                str.append(s.charAt(i));
            }    
        }
        return str.toString();
    }
}


//other way
    // public static String removeVowels(String s) {
    //     s = s.toLowerCase();
    //     StringBuilder str = new StringBuilder();
    //     for (char ch : s.toCharArray()) {
    //         if ("aeiou".indexOf(ch) == -1){
    //             str.append(ch);
    //         }    
    //     }
    //     return str.toString();
    // }