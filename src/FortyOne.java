public class FortyOne {
    public static void main(String[] args) {
        // Problem 41: Octal to Binary Conversion
        String octal = "5";
        String ans = octalToBinary(octal);
        System.out.println(ans);
    }

    public static String octalToBinary(String octal) {
        int decimal = 0;
        if (octal.equals("0")) return "0";
        for (int i=0; i<octal.length(); i++) {
            decimal = decimal * 8 + (octal.charAt(i) - '0');
        }

        StringBuilder binary = new StringBuilder();

        while (decimal!=0) {
            int remainder = decimal%2;
            binary.append(remainder);
            decimal/=2;
        }
        return binary.reverse().toString();
    }
}

// int digit = octal.charAt(i)
// int binary = Integer.toBinaryString(digit);