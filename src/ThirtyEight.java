public class ThirtyEight {
    public static void main(String[] args) {
        // Problem 38: Decimal to Hexadecimal Conversion
        int decimal = 26;
        String ans = decimalToHexadecimal(decimal);
        System.out.println(ans);
    }

    public static String decimalToHexadecimal(int decimal) {
        StringBuilder hexa = new StringBuilder();

        while (decimal!=0) {
            int remainder = decimal % 16;
            if (decimal == 0) return "0";
            if (remainder>=0 && remainder<=9) hexa.append(remainder);
            if (remainder>=10 && remainder<=15) {
                char hexChar = (char)('A' + (remainder-10));
                hexa.append(hexChar);
            }   
            decimal/=16;
        }
        return hexa.reverse().toString();
    }
}
