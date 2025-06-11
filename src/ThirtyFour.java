public class ThirtyFour {
    public static void main(String[] args) {
        // program 34: Octal to decimal conversion
        String octal = "77777777777";
        long ans = octalToDecimal(octal);
        System.out.println(ans);        
    }

    public static long octalToDecimal(String octal) {
        long sum = 0;
        for (int i=0; i<octal.length(); i++) {
            sum = sum * 8 + octal.charAt(i) - '0';
        }
        return sum;
    } 
}
