public class ThirtyThree {
    public static void main(String[] args) {
        // problem 33: Binary to decimal conversion
        String binary = "10000000000000000000000000000000";
        long ans = binaryToDecimal(binary);
        System.out.println(ans);
    }

    public static long binaryToDecimal(String binary) {
        
        int first = binary.length()-1;
        long sum = 0;
    
        for (int i=0; i<binary.length(); i++) {
            if (first<0) return sum;
            int position = (int)Math.pow(2, first); 
            sum += (binary.charAt(i) - '0') * position;
            first--;

            
        }
        return sum;
    }
}


// OPTIMISED CODE

    // public static long binaryToDecimal(String binary) {
    //     int sum = 0;
    //     for (int i=0; i< binary.length(); i++) {
    //         sum = sum*2 + (binary.charAt(i) - '0');
    //     }
    //     return sum;
    // }