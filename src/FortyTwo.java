public class FortyTwo {
    public static void main(String[] args) {
        // Problem 42: Determine Quadrant of a Coordinate
        // x>0 and y>0 -> quad 1
        // x<0 and y<0 -> quad 3
        // x<0 and y>0 -> quad 2
        // x>0 and y<0 -> quad 4
        int x = -3;
        int y = -5;
        String ans = determineQuadrant(x, y);
        System.out.println(ans);
    }

    public static String determineQuadrant(int x, int y) {
        if (x==0 && y==0) return "Origin";
        if (x==0 || y==0) return "On Axis";
        if (x>0 && y>0) return "Quadrant 1";
        else if (x<0 && y<0) return "Quadrant 3";
        else if (x<0 && y>0) return "Quadrant 2";
        else return "Quadrant 4";
    }
}
