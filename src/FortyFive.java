public class FortyFive {
    public static void main(String[] args) {
        // Problem 45: Addition of Two Fractions
        int num1 = 1, den1 = 2;
        int num2 = 1, den2 = 3;
        addTwoFraction(num1, den1, num2, den2);
    }
    public static void addTwoFraction(int num1, int den1, int num2, int den2) {
        int resNum = 0, resDen = 0;

        resNum = (num1*den2) + (num2*den1);
        resDen = (den1 * den2);
        if (resDen == 0)  System.out.println( "divide by zero exception");
        System.out.println(resNum + "/" + resDen);
    }
}


// OPTIMISED CODE 

//     public static String addTwoFraction(int num1, int den1, int num2, int den2) {
//         int resNum = 0, resDen = 0; 
//         if (den1 == 0 || den2 == 0) return "Divide by 0 exception";
    
//         resNum = (num1*den2) + (num2*den1);
//         resDen = (den1 * den2);
        
//         int gcd = findGCD(resNum, resDen);
//         resNum/=gcd;
//         resDen/=gcd;

//         System.out.println(resNum + "/" + resDen);
//     }

//     public static int findGCD(int resNum, int resDen) {
//         while (resDen != 0) {
//             int temp = resDen;
//             resDen = resNum%resDen;
//             resNum = temp;
//         }
//         return resNum;
//     }