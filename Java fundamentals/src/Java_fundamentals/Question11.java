package Java_fundamentals;
import java.util.*;
public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (Character.isLowerCase(ch)) {
            char upper = Character.toUpperCase(ch);
            System.out.println("Converted to uppercase: " + upper);
        } else if (Character.isUpperCase(ch)) {
            char lower = Character.toLowerCase(ch);
            System.out.println("Converted to lowercase: " + lower);
        } else {
            System.out.println("Not an alphabet character.");}

	}

}