public class ThirtyFive {
    public static void main(String[] args) {
        // Problem 35: Hexadecimal to Decimal Conversion
        String hex = "AF";
        int ans = hexadecimalToDecimal(hex);
        System.out.println(ans);
    }

    public static int hexadecimalToDecimal(String hex) {
        int decimal = 0;
        hex = hex.toUpperCase();
        for (int i=0; i<hex.length(); i++) {
            char ch = hex.charAt(i);
            int digit = 0;
            if (ch >= '0' && ch<='9') digit = ch - '0';
            else if (ch >= 'A' && ch <= 'F') digit = 10 + (ch - 'A');
            else return 0;

            decimal = decimal * 16 + digit;
        }
        return decimal;
    }
}
