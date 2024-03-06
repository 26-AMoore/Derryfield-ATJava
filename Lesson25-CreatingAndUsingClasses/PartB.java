import java.util.Scanner;

public class PartB {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String helper;
		CashRegister cr = new CashRegister();
		boolean cashingRegisters = true;
		do {
			System.out.println("Add a price, or use t to show totals, c to clear, and q to quit");
			helper = in.next();
			switch (helper.charAt(0)) {
				case 't' -> System.out.println("Total = " + cr.getTotal() + " Count = " + cr.getCount());
				case 'c' -> cr.clear();
				case 'q' -> cashingRegisters = false;
				default -> cr.addItem(Double.valueOf(helper));
			}
		} while (cashingRegisters);
	}
}

class CashRegister {
	private double totalPrice;
	private int itemCount;

	public CashRegister() {
		totalPrice = 0;
		itemCount = 0;
	}
	/*
	* Add the price of an item to the register's total.
    */
	public void addItem(double price) {
		totalPrice = totalPrice + price;
		itemCount++;
	}
	/*
	* Return the current total sales amount.
	*/
	public double getTotal() {
		return totalPrice;
	}


	/*
	* Return the total count of items in the current sale.
	*/
	public int getCount() {
		return itemCount;
	}
	/*
	* Clear the register (total and count) for a new sale.
	*/
	public void clear() {
		totalPrice = 0;
		itemCount = 0;
	}
}

