public class Forty {
    public static void main(String[] args) {
        // problem 40: Binary to Octal conversion
        String binary = "11010";
        String ans = binaryToOctal(binary);
        System.out.println(ans);
    }

    public static String binaryToOctal(String binary) {
        int decimal = 0;

        if (binary.equals("0")) return "0";
        for (int i=0; i<binary.length(); i++) {
            decimal = decimal*2 + (binary.charAt(i) - '0');
        }

        StringBuilder octal = new StringBuilder();

        while (decimal!=0) {
            int remainder = decimal%8;
            octal.append(remainder);
            decimal/=8;
        }
        return octal.reverse().toString();
    }
}
