package Oops;
import java.util.*;

class Question2 {

    // Method to calculate power with integer values
    static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    // Method to calculate power with double values
    static double powerDouble(double num1, double num2) {
        return Math.pow(num1, num2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading integer base and exponent
        int intBase = sc.nextInt();
        int intExp = sc.nextInt();
        int intResult = powerInt(intBase, intExp);
        System.out.println(intResult);

        // Reading double base and integer exponent
        double doubleBase = sc.nextDouble();
        int doubleExp = sc.nextInt();
        double doubleResult = powerDouble(doubleBase, doubleExp);
        System.out.println(doubleResult);

        sc.close(); // optional: close scanner
    }
}
