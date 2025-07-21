package WrappersClasses;


class Employee implements Cloneable {
    int id;
    String name;
    double salary;

    // Constructor
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Override clone() method
    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone(); // shallow copy
    }

    // Display method
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class Question4 {
    public static void main(String[] args) {
        try {
         
            Employee emp1 = new Employee(101, "Aaliya", 50000);
            
        
            Employee empClone = emp1.clone();

            System.out.println("Before modifying original:");
            System.out.print("Original: ");
            emp1.display();
            System.out.print("Clone:    ");
            empClone.display();
            emp1.name = "Shaik Aaliya";
            emp1.salary = 60000;

            System.out.println("\nAfter modifying original:");
            System.out.print("Original: ");
            emp1.display();
            System.out.print("Clone:    ");
            empClone.display();

        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported");
        }
    }
}