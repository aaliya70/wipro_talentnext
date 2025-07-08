package Arrays;
import java.util.*;
public class Array8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	Scanner sc= new Scanner(System.in);
			int n=sc.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
	        int sum = 0;
	        boolean avoid = false;

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == 6) {
	                avoid = true; 
	            } else if (arr[i] == 7 && avoid) {
	                avoid = false; 
	            } else if (!avoid) {
	                sum = sum + arr[i]; 
	            }
	        }

	        System.out.println("Sum = " + sum);
	    }
	


}