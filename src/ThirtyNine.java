public class ThirtyNine {
    public static void main(String[] args) {
        // Problem 39: Hexadecimal to Binary Conversion
        String hexa = "1A";
        String ans = hexaToBinary(hexa);
        System.out.println(ans);  // Should print: 11010
    }

    public static String hexaToBinary(String hexa) {
        StringBuilder binary = new StringBuilder();

        for (int i = 0; i < hexa.length(); i++) {
            char digit = hexa.charAt(i);

            int decimalValue;
            if (digit >= '0' && digit <= '9') {
                decimalValue = digit - '0';  // '3' - '0' = 3
            } else if (digit >= 'A' && digit <= 'F') {
                decimalValue = digit - 'A' + 10;  // 'A' - 'A' + 10 = 10
            } else {
                throw new IllegalArgumentException("Invalid hex digit: " + digit);
            }

            // Convert decimal value to binary string with padding
            String binaryPart = String.format("%4s", Integer.toBinaryString(decimalValue)).replace(' ', '0');
            binary.append(binaryPart);
        }

        // Remove leading zeros if not the number 0
        String result = binary.toString().replaceFirst("^0+(?!$)", "");
        return result;
    }
}
