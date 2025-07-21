public class HundredTwentyThree {
    public static void main(String[] args) {
        // Problem 123: Print the Given String in Reverse Order
        String s = "Rajath";
        String result = reverseString(s);
        System.out.println(result);
    }

    public static String reverseString(String s) {
        StringBuilder str = new StringBuilder();

        for (int i=s.length()-1; i>=0; i-- ) {
            str.append(s.charAt(i));
        }
        return str.toString();
    }
    
}

    // public static String reverseString(String s) {
    //     StringBuilder str = new StringBuilder();
    //     str.append(s);
    //     StringBuilder result = str.reverse();
    //     return result.toString();
    // }