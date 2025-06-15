import java.util.HashMap;

public class FifityOne {
    public static void main(String[] args) {
        // Problem 51: Convert Digit / Number to Words
        String n = "02345378";
        convertNumberToWords(n);
    }

    public static void convertNumberToWords(String n) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(0, "Zero");
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        map.put(6, "Six");
        map.put(7, "Seven");
        map.put(8, "Eight");
        map.put(9, "Nine");

        for (int i = 0; i < n.length(); i++) {
            System.out.print(map.get(n.charAt(i) - '0') + " ");
        }
    }
}
