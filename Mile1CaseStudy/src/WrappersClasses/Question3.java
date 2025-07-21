package WrappersClasses;
import java.util.Scanner;
public class Question3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter a number between 1 and 255: ");
        int number = scanner.nextInt();

        // Validate input
        if (number < 1 || number > 255) {
            System.out.println("Invalid input! Please enter a number between 1 and 255.");
            return;
        }

        // Convert to binary and pad with leading zeros
        String binaryString = String.format("%8s", Integer.toBinaryString(number)).replace(' ', '0');

        // Print result
        System.out.println("Binary representation: " + binaryString);

        scanner.close();
    }
}