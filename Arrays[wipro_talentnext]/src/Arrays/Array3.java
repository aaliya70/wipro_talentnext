package Arrays;

import java.util.*;

public class Array3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int num = sc.nextInt();
		System.out.println("The search element is " + num);

		boolean found = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				found = true;
				System.out.println(i);
				break;
			}
		}

		if (!found) {
			System.out.println(-1);
		}

		sc.close();
	}
}
