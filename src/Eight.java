import java.time.Year;

public class Eight {
    public static void main(String[] args) {
        // Problem 8: Leap Year or Not
        long year = 10000000;
        String ans = leapYearOrNot(year);
        System.out.println(ans);
    }

    public static String leapYearOrNot(long year) {
        if (year%4 == 0 && year%100 != 0) {
            return "Leap Year";
        }
        if (year%400 == 0) {
            return "Leap Year";
        }
        return "Not a Leap Year";
    }
}
