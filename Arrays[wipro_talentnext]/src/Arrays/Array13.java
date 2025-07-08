package Arrays;
import java.util.*;
public class Array13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        int[][] array = new int[3][3];

        System.out.println("Enter 9 integer values for the 3x3 array:");


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        
        System.out.println("The given array is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


        int max = array[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }

     
        System.out.println("The biggest number in the given array is " + max);
    }
}

