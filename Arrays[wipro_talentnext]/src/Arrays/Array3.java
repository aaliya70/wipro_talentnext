package Arrays;
import java.util.*;

public class Array3{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int p;
		boolean b=false;
		int num =sc.nextInt();
		System.out.println("the search element is "+num);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				b=true;
				p=i;
				System.out.println(p);
				break;
				
				
			}
			
			
			
		}
		if (b==false) {
			System.out.print(-1);
			
		}
	
		
	}

}