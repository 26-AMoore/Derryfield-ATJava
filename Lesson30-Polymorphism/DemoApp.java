import Employes.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DemoApp {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Employee> employees = new ArrayList<>();
		while (true) {
			System.out.print("Enter a letter (E)mployee, (M)anager, e(X)ecutive or (Q)uit): ");
			String choice = in.nextLine().toLowerCase();
			String name;
			double salary;
			double bonus;
			if (choice.charAt(0) == 'q') {
				// exit the loop.
				break;
			} else if (choice.charAt(0) == 'e') {
				// create a new employee;
				System.out.print("Enter name: ");
				name = in.nextLine();
				System.out.print("Enter salary (as a double): ");
				salary = Double.parseDouble(in.nextLine());
				Employee employee = new Employee(name, salary);

				// add to array list.
				employees.add(employee);
			} else if (choice.charAt(0) == 'm') {
				// create a new manager;
				System.out.print("Enter name: ");
				name = in.nextLine();
				System.out.print("Enter salary (as a double): ");
				salary = Double.parseDouble(in.nextLine());
				System.out.print("Enter bonus (as a double): ");
				bonus = Double.parseDouble(in.nextLine());
				Manager manager = new Manager(name, salary, bonus);

				// add to array list.
				employees.add(manager);
			} else if (choice.charAt(0) == 'x') {
				System.out.print("Enter name: ");
				name = in.nextLine();
				System.out.print("Enter salary (as a double): ");
				salary = Double.parseDouble(in.nextLine());
				System.out.print("Enter bonus (as a double): ");
				bonus = Double.parseDouble(in.nextLine());
				System.out.print("Enter stocks (as a double): ");
				double stocks = Double.parseDouble(in.nextLine());
				Executive executive = new Executive(name, salary, bonus, stocks);
				employees.add(executive);
			} else {
				System.out.println("I don't understand your choice.");
			}

			// put a newline to make it easier to read.
			System.out.println();
		}

		// insert newline to make it easier to read.
		System.out.println();

		// after entering in data, loop through the array list and display info.
		System.out.printf("Your company has %d employees.%n", employees.size());
		System.out.println();

		for (Employee employee : employees) {
			employee.displayInfo();
			System.out.println();
			System.out.println(employee.toString());
		}
	}
}
