package Java_fundamentals;
import java.util.*;
public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		if((c>='a'&&c<='z')||(c>='A' && c<='Z')){
			System.out.println("Alphabet");
			
		}
		else if(c>=0 && c<=9) {
			System.out.println("Digit");
			
		}
		else {
			System.out.println("Special character");
		}

	}

}
