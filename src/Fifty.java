public class Fifty {
    public static void main(String[] args) {
        // Problem 50: Find the Prime Numbers Between 1 to 100
        primeNumberInRange();
    }

    public static void primeNumberInRange() {
        for (int i=2; i<=100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        for (int i=2; i*i<=n; i++) {
            if (n%i ==0) {
                return false;
            }
        }
        return true;
    }
}
