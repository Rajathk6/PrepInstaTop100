public class FiftySeven {
    public static void main(String[] args) {
        // Problem 57: Prime Number Using Recursion
        int num = 2;
        if (primeNumberRecursion(num,2)) System.out.println("Prime");
        else System.out.println("Not Prime");
    }

    public static boolean primeNumberRecursion(int num, int i) {
        if (i*i>num) return true;

        if (num%i==0) return false;
        return primeNumberRecursion(num, i+1);
    }
}