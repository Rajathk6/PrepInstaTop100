public class FortySeven {
    public static void main(String[] args) {
        // Problem 47: Can a Number Be Expressed as the Sum of Two Prime Numbers?
        int n = 34;
        findPrimeSum(n);
    } 
    public static void findPrimeSum(int n) {
        boolean found = true;
        for (int i=2; i<=n/2; i++) {
            int another = n-i;
            if (isPrime(i) && isPrime(another)) {
                System.out.println(i + "+" + another);
                found = true;
            }
        }
        if (!found) System.out.println("Cannot be expressed as the sum of prime numbers");
    }

    public static boolean isPrime(int n) {
        for (int i=2; i*i<=n; i++) {
            if (n%i==0) return false;
        }
        return true;
    }
}
