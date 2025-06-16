public class FiftyFive {
    public static void main(String[] args) {
        // Problem 55: Finding Roots of a Quadratic Equation
        int a = 1, b = 2, c = 1;
        rootsOfQuadEquation(a, b, c);        
    }

    public static void rootsOfQuadEquation(int a, int b, int c) {
        double determinant = (b*b) - 4*a*c;

        if (determinant==0) {
            double x = -b / (2.0*a);
            System.out.printf("Real and equal roots: %.2f and %.2f", x, x);
        } 
        else if (determinant>0) {
            double x = (-b + Math.sqrt(determinant))/(2.0*a);
            double y = (-b - Math.sqrt(determinant))/(2.0*a);
            System.out.printf("Real and distinct roots: %.2f and %.2f",x, y);
        } else {
            double x = -b/(2*a);
            double y = Math.sqrt(-determinant)/(2.0*a);
            
            System.out.printf("complex roots: %.2f + %.2fi and %.2f - %.2fi",x, y);
        }
    }
}
