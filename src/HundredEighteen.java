public class HundredEighteen {
    public static void main(String[] args) {
        // Problem 118: Length of the String Without Using length() Function
        String string = " ";
        int result = lengthOfString(string);
        System.out.println(result);
    }

    public static int lengthOfString(String s) {
        int count = 0;

        for (char i : s.toCharArray()) {
            s.charAt(i);
            count++;
        }
        return count;
    }
}

    // public static int lengthOfString(String s) {
    //     int count = 0;

    //     try {
    //         while (true) {
    //             s.charAt(count);
    //             count++;
    //         } 
    //     } catch (IndexOutOfBoundsException e) {
    //         return count;
    //     }
    // }