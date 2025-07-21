package Abstraction;

import java.util.Random;

//Abstract class Compartment
abstract class Compartment {
 public abstract String notice();
}

//Subclass FirstClass
class FirstClass extends Compartment {
 @Override
 public String notice() {
     return "First Class Compartment";
 }
}

//Subclass Ladies
class Ladies extends Compartment {
 @Override
 public String notice() {
     return "Ladies Compartment";
 }
}

//Subclass General
class General extends Compartment {
 @Override
 public String notice() {
     return "General Compartment";
 }
}

//Subclass Luggage
class Luggage extends Compartment {
 @Override
 public String notice() {
     return "Luggage Compartment";
 }
}

//Main Test Class
public class TestCompartment {
 public static void main(String[] args) {
     Compartment[] compartments = new Compartment[10];
     Random rand = new Random();

     for (int i = 0; i < compartments.length; i++) {
         int randomType = rand.nextInt(4) + 1; // Generates 1 to 4

         switch (randomType) {
             case 1:
                 compartments[i] = new FirstClass();
                 break;
             case 2:
                 compartments[i] = new Ladies();
                 break;
             case 3:
                 compartments[i] = new General();
                 break;
             case 4:
                 compartments[i] = new Luggage();
                 break;
         }

         // Check polymorphic behavior
         System.out.println("Compartment " + (i + 1) + ": " + compartments[i].notice());
     }
 }
}