public class SixtyThree {
 public static void main(String[] args) {
      // Problem 63: Calculate Length of the String using Recursion
      String name = "Rajath";
      int ans = lengthOfStringRecursion(name, 0);
      System.out.println(ans);
   }   

   public static int lengthOfStringRecursion(String name, int index) {

      if (name.length() == index) return 0;

      return 1+lengthOfStringRecursion(name, index+1);
   }
}
