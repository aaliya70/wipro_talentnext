package Exceptionhandling;

import java.util.Scanner;

//Custom Exception for Invalid Marks
class InvalidMarksException extends Exception {
 public InvalidMarksException(String message) {
     super(message);
 }
}

public class Studentmarks {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     final int STUDENT_COUNT = 2;

     for (int i = 1; i <= STUDENT_COUNT; i++) {
         try {
             System.out.println("\nEnter details for Student " + i + ":");
             System.out.print("Name: ");
             String name = sc.nextLine();

             int[] marks = new int[3];
             int sum = 0;

             for (int j = 0; j < 3; j++) {
                 System.out.print("Enter mark " + (j + 1) + ": ");
                 String input = sc.nextLine();

                 try {
                     marks[j] = Integer.parseInt(input); // May throw NumberFormatException

                     if (marks[j] < 0) {
                         throw new InvalidMarksException("Marks cannot be negative.");
                     } else if (marks[j] > 100) {
                         throw new InvalidMarksException("Marks should be in range 0-100.");
                     }

                     sum += marks[j];
                 } catch (NumberFormatException e) {
                     throw new NumberFormatException("Invalid input! Please enter integer only.");
                 }
             }

             double average = sum / 3.0;
             System.out.println("Average marks of " + name + ": " + average);

         } catch (InvalidMarksException e) {
             System.out.println("Error: " + e.getMessage());
         } catch (NumberFormatException e) {
             System.out.println("Error: " + e.getMessage());
         } catch (Exception e) {
             System.out.println("Unexpected error: " + e);
         }
     }

     sc.close();
 }
}
