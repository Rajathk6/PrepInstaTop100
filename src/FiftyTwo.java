import java.util.HashMap;

public class FiftyTwo {
    public static void main(String[] args) {
        // Problem 52: Count Number of Days in a Given Month of a Year
        int month = 2;
        int year = 2016;
        int ans = countDaysInMonthYear(month, year);
        System.out.println(ans);
    }

    public static int countDaysInMonthYear(int month, int year) {
        if (month == 2) {
            return isLeap(year) ? 29 : 28;
        }

        HashMap<Integer, Integer> monthMap = new HashMap<Integer, Integer>();
        monthMap.put(1, 31);
        monthMap.put(3, 31);
        monthMap.put(4, 30);
        monthMap.put(5, 31);
        monthMap.put(6, 30);
        monthMap.put(7, 31);
        monthMap.put(8, 31);
        monthMap.put(9, 30);
        monthMap.put(10, 31);
        monthMap.put(11, 30);
        monthMap.put(12, 31);

        if (monthMap.containsKey(month)) return monthMap.get(month);
        return 0;
    }

    public static boolean isLeap(int year) {
        if (year%400==0) return true;
        if (year%4==0 && year%100!=0) return true;
        return false; 
    }
}
