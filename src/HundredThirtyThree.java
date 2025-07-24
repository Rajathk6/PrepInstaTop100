public class HundredThirtyThree {
    public static void main(String[] args) {
        // Program 133: Replace a particular word with another word in a string
        // the same code as 132 works for this one as well
        String s = "the cat chased the cat down the street";  
        String targetWord = "cat";  
        String replacementWord = "dog";
        String result = replaceWord(s, targetWord, replacementWord);
        System.out.println(result);
    }

    public static String replaceWord(String s, String targetWord, String replacementWord) {
        String[] str = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : str) {
            if (word.equals(targetWord)) {
                result.append(replacementWord);
            } else {
                result.append(word);
            }
            result.append(" ");
        }
        return result.toString().trim();
    }   
}
