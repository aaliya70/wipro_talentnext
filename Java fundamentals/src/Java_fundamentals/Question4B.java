package Java_fundamentals;
import java.util.*;
public class Question4B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in) ;
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		if(num1>0 & num2>0) {
			if(num1% 10==num2 % 10) {
				System.out.print("True");
				
			}
			else {
				System.out.println("False");
			}
	}

	}
}
