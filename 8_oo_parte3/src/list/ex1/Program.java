package list.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		var list = new ArrayList<Employee>();

		System.out.print("How many employees will be registered?");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			while(hasId(list, id)) {
				System.out.println("There is at least an employee with this id!");
				System.out.print("NEW Id: ");
				id = sc.nextInt();
			}
			
			Employee e = new Employee(id, name, salary);
			list.add(e);
		}

		System.out.println("List of employees");

		for (Employee employee : list) {
			System.out.println(employee);
		}

		sc.close();
	}

	public static boolean hasId(List<Employee> list, int id) {
		for (Employee employee : list) {
			if (employee.getId() == id)
				return true;
		}

		return false;
	}

}





