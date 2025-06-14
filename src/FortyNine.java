public class FortyNine {
    public static void main(String[] args) {
        // Problem 49: Calculate the Area of a Circle
        int radius = 5;
        double ans = areaOfCircle(radius);
        System.out.println(ans);
    }

    public static double areaOfCircle(int r) {
        double pi = 3.14159;
        double area = pi * (r*r);
        return Math.round(area *100.0)/100.0;
    }
}
