package Exceptionhandling;
import java.util.Scanner;
public class Question1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Step 1: Read number of elements
            System.out.println("Enter the number of elements in the array");
            int n = Integer.parseInt(scanner.nextLine());

            int[] arr = new int[n];

            // Step 2: Read elements
            System.out.println("Enter the elements in the array");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(scanner.nextLine());
            }

            // Step 3: Read index to access
            System.out.println("Enter the index of the array element you want to access");
            int index = Integer.parseInt(scanner.nextLine());

            // Step 4: Access element at index
            System.out.println("The array element at index " + index + " = " + arr[index]);
            System.out.println("The array element successfully accessed");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("java.lang.ArrayIndexOutOfBoundsException");
        } catch (NumberFormatException e) {
            System.out.println("java.lang.NumberFormatException");
        }

        scanner.close();
    }
}