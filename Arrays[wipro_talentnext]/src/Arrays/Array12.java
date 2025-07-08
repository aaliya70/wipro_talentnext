package Arrays;
import java.util.*;
public class Array12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);


        int[] a = new int[3];
        int[] b = new int[3];

  
        System.out.println("Enter 3 elements for array a:");
        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }

   
        System.out.println("Enter 3 elements for array b:");
        for (int i = 0; i < 3; i++) {
            b[i] = sc.nextInt();
        }
        int[] result = { a[1], b[1] };

        System.out.print("Middle elements: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}

