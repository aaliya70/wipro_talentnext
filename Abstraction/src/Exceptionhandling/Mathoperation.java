package Exceptionhandling;
public class Mathoperation {

    public static void main(String[] args) {
        try {
            // Check if exactly 5 arguments are passed
            if (args.length != 5) {
                throw new IllegalArgumentException("Exactly 5 integers are required.");
            }

            int[] numbers = new int[5];
            int sum = 0;

            // Parse command-line arguments and calculate sum
            for (int i = 0; i < 5; i++) {
                numbers[i] = Integer.parseInt(args[i]); // may throw NumberFormatException
                sum += numbers[i];
            }

            double average = sum / 5.0; // avoid ArithmeticException with float division

            // Display results
            System.out.println("Sum = " + sum);
            System.out.println("Average = " + average);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers only.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Arithmetic error occurred - " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e);
        }
    }
}
