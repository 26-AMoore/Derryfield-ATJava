package Employes;
public class Executive extends Manager {
	private double stocks;
	public Executive(String name, double salary, double bonus, double stocks) {
		super(name, salary, bonus);
		this.stocks = stocks;
	}

	public void displayInfo() {
		super.displayInfo();
		System.out.printf("Shares : %,.2f%n", stocks);
	}
}
