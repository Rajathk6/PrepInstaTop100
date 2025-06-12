public class ThirtySeven {
    public static void main(String[] args) {
        // Problem 37: Decimal to Octal Conversion
        int decimal = 0;
        String ans = decimalToOctal(decimal);
        System.out.println(ans);
    }

    public static String decimalToOctal(int decimal) {
        StringBuilder octal = new StringBuilder();
        if (decimal == 0) return "0";
        while (decimal!=0) {
            int remainder = decimal % 8;
            octal.append(remainder);
            decimal/=8;
        }
        return octal.reverse().toString();
    }
}
