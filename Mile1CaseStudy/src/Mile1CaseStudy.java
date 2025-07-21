import java.util.Scanner;

class StudentNotFoundException extends Exception {
 public StudentNotFoundException(String message) {
     super(message);
 }
}

//Student Class
class Student {
 int rollNo;
 String name;
 double marks;

 Student(int rollNo, String name, double marks) {
     this.rollNo = rollNo;
     this.name = name;
     this.marks = marks;
 }

 void display() {
     System.out.println("Roll No: " + rollNo);
     System.out.println("Name: " + name);
     System.out.println("Marks: " + marks);
 }
}

public class Mile1CaseStudy {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     Student[] students = new Student[3];
     students[0] = new Student(101, "Aaliya", 88.5);
     students[1] = new Student(102, "Rahul", 76.0);
     students[2] = new Student(103, "Sneha", 91.2);

     try {
         System.out.print("Enter the index of the student (0 to 2): ");
         int index = sc.nextInt();

         if (index < 0 || index >= students.length) {
             // throw custom exception
             throw new StudentNotFoundException("Invalid student index!");
         }


         students[index].display();

     } catch (StudentNotFoundException e) {
         System.out.println("Error: " + e.getMessage());

     } catch (Exception e) {
         System.out.println("An unexpected error occurred: " + e);

     } finally {
         sc.close();
         System.out.println("Program Ended.");
     }
 }
}
