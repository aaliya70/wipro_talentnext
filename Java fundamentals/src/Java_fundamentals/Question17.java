package Java_fundamentals;
import java.util.*;
public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();

	        int reversed = 0;

	        
	        while (number != 0) {
	            int digit = number % 10;       
	            reversed = reversed * 10 + digit; 
	            number = number / 10;           
	        }

	       
	        System.out.println(reversed);
	}

}
