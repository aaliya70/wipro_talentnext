package Arrays;
import java.util.*;
public class Array10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        Scanner sc = new Scanner(System.in);

  
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

   
        System.out.println("Enter " + n + " array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = new int[n];
        int index = 0;

       
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                result[index++] = arr[i];
            }
        }

     
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                result[index++] = arr[i];
            }
        }

    
        System.out.println("Array with even numbers first, then odd numbers:");
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i]);
            if (i < n - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}

