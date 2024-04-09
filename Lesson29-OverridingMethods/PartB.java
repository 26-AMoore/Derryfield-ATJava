public class PartB {
	public static void main(String[] args) {
		Employee john = new Employee("john", 10000);
		Manager paul = new Manager("paul", 50000, 100);
		System.out.println("john " + john.getAnnualIncome() + " paul " + paul.getAnnualIncome());
	}
}

class Manager extends Employee {
	private double extra;
	public Manager(String name, double salary, double bonus) {
		super(name, salary);
		extra = bonus;
	}

	public double getAnnualIncome() {
		return this.getSalary() + extra;
	}
}
