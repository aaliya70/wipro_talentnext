package Java_fundamentals;
import java.util.Scanner;
public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

     
        int num = sc.nextInt();
        int sum = 0;

        int temp = Math.abs(num);  

        while (temp > 0) {
            int digit = temp % 10;   
            sum += digit;           
            temp /= 10;             
        }

        System.out.println("Sum of digits: " + sum);

        sc.close();
    }
}

