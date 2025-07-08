package Arrays;
import java.util.*;
public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr =new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		int min1=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		
		
		for(int num : arr) {
			   if (num > max1) {
	                max2 = max1;
	                max1 = num;
	            } else if (num > max2 && num != max1) {
	                max2 = num;
	            }
	        
			if(num <min1) {
				min2=min1;
				min1=num;
			}
			else if (num < min2 && num != min1) {
                min2 = num;
            }
			
		}
		
		
		System.out.println(max1);
		System.out.println(max2);
		System.out.println(min1);
		System.out.println(min2);

	}

}
