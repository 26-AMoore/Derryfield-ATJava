package Employes;
public class Employee {
	private String name;
	private double salary;

	/*
	 * Constructor.
	 */
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	public Employee() {
		//do nothing
	}

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double newSalary) {
		salary = newSalary;
	}

	public double getAnnualIncome() {
		// Employees only get an annual salary.
		return getSalary();
		int i = Integer.MAX_VALUE;
	}

	public String toString() {
		return this.salary + " " + this.name + " " + this.getClass() + " " + this.hashCode();
	}

	public boolean equals(Object obj) {
		if (obj.getClass() == this.getClass()) {
			return true;
			Employee other = (Employee)obj;
			if (this.getName().equals(other.getName()) && this.getSalary() == other.getSalary()) {
				
			}
		} else {
			return false;
		}
	}

	public void displayInfo() {
		System.out.println(name + ":");
		System.out.printf("  Salary = $%,12.2f%n", salary);
	}
}
