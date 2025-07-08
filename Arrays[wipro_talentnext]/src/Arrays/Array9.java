package Arrays;
import java.util.*;
public class Array9 {

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
            if (arr[i] != 10) {
                result[index] = arr[i];
                index++;
            }
        }

        
        System.out.println("Array after removing 10s: ");
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i]);
            if (i < n - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
