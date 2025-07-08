package Project;
import java.util.*;
public class Project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of employees:");
		int n = sc.nextInt();

		// Arrays for storing employee details
		int[] empno = new int[n];
		String[] ename = new String[n];
		String[] dept = new String[n];
		char[] desgCode = new char[n];
		int[] basic = new int[n];
		int[] hra = new int[n];
		int[] it = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("\nEnter details for employee " + (i + 1) + ":");

			System.out.println("Emp No:");
			empno[i] = sc.nextInt();
			sc.nextLine(); // consume newline

			System.out.println("Emp Name:");
			ename[i] = sc.nextLine();

			System.out.println("Department:");
			dept[i] = sc.nextLine();

			System.out.println("Designation Code (e/c/k/r/m):");
			desgCode[i] = sc.next().charAt(0);

			System.out.println("Basic Salary:");
			basic[i] = sc.nextInt();

			System.out.println("HRA:");
			hra[i] = sc.nextInt();

			System.out.println("IT:");
			it[i] = sc.nextInt();
		}

		System.out.println("\nEnter empid to search:");
		int searchId = sc.nextInt();
		sc.close();

		boolean found = false;

		for (int i = 0; i < n; i++) {
			if (empno[i] == searchId) {
				found = true;
				int da = 0;
				String desg = "";

				switch (desgCode[i]) {
				case 'e':
					desg = "Engineer";
					da = 20000;
					break;
				case 'c':
					desg = "Consultant";
					da = 32000;
					break;
				case 'k':
					desg = "Clerk";
					da = 12000;
					break;
				case 'r':
					desg = "Receptionist";
					da = 15000;
					break;
				case 'm':
					desg = "Manager";
					da = 40000;
					break;
				default:
					desg = "Unknown";
					da = 0;
					break;
				}

				int salary = basic[i] + hra[i] + da - it[i];

				System.out.println("\nEmp No.\tEmp Name\t\tDepartment\tDesignation\tSalary");
				System.out.println(empno[i] + "\t" + ename[i] + "\t\t" + dept[i] + "\t\t" + desg + "\t\t" + salary);
				break;
			}
		}

		if (!found) {
			System.out.println("There is no employee with empid: " + searchId);
		}
	}
}
