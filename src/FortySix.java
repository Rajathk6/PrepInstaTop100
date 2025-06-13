public class FortySix {
    public static void main(String[] args) {
        // Problem 46: Replace all 0’s with 1 in a Given Integer
        int n = 102040;
        int ans = replaceZeroWithOne(n);
        System.out.println(ans);
    }

    public static int replaceZeroWithOne(int n) {
        String numb = Integer.toString(n);
        return Integer.parseInt(numb.replace("0", "1"));
    }
}

    // public static int replaceZerosWithOnes(int number) {
    //     if (number == 0) return 1;

    //     int result = 0;
    //     int place = 1;

    //     while (number > 0) {
    //         int digit = number % 10;
    //         if (digit == 0) digit = 1;

    //         result += digit * place;
    //         place *= 10;
    //         number /= 10;
    //     }

    //     return result;
    // }