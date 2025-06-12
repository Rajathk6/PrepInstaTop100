import java.util.ArrayList;
import java.util.Arrays;

public class ThirtySix {
    public static void main(String[] args) {
        // Problem 36: Decimal to Binary Conversion
        int decimal = 43;
        int[] ans = decimalToBinary(decimal);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] decimalToBinary(int decimal) {
        int temp = decimal;
        ArrayList<Integer> binary = new ArrayList<>();
        
        while (temp!=0) {
    
            binary.add(temp%2);
            temp = temp/2;
        }

        int[] arr = new int[binary.size()];
        for (int i=0; i<arr.length; i++) {
            arr[i] = binary.get((arr.length-1)-i);
        }
        return arr;
    }
}


// OPTIMISED CODE

//     public static String decimalToBinary(int decimal) {
//         StringBuilder binary = new StringBuilder();

//         while (decimal > 0) {
//             int remainder = decimal % 2;
//             binary.append(remainder);
//             decimal = decimal/2; 
//         }
//         return binary.reverse().toString();
//     