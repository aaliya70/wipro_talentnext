package Java_fundamentals;
import java.util.Scanner;
public class Question10{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String gender=sc.nextLine();
int age=sc.nextInt();
if(gender.equals("female")) {
	if(age>=1 && age<=58) {
		System.out.println("the percentage of intrest is 8.2%");}
	if(age>=59 && age<=100) {
		System.out.println("the percentage of intrest is 9.2%");}}
	else  {
		
		if(age>=1 && age<=58) {
		System.out.println("the percentage of intrest is 8.4%");}
		else {
		
				System.out.println("the percentage of intrest is 10.5%");}
		}
	
sc.close();
	}
}
