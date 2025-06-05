public class Two {
    public static void main(String[] args) {
        // Problem 2: Even or Odd Numbers
        int num = 1000000;
        String ans = evenOdd(num);
        System.out.println(ans);
    }

    public static String evenOdd(int num) {
        if (num == 0) {
            return "Even";
        } else if(num % 2 == 0) {
            return "Even";
        }
        return "Odd";
    }

    // OPTIMISED
    // return (num%2==0) ? "Even" : "Odd";
}
