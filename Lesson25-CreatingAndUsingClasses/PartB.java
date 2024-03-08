import java.util.ArrayList;
import java.util.Scanner;

public class PartB {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String helper;
		CashRegister cr = new CashRegister();
		boolean cashingRegisters = true;
		do {
			System.out.println("Add a price, or use t to show totals, c to clear, d to remove the last added item, and q to quit");
			helper = in.next();
			switch (helper.charAt(0)) {
				case 't' -> System.out.println("Total = " + cr.getTotal() + " Count = " + cr.getCount() + " Items: " + cr.show());
				case 'c' -> cr.clear();
				case 'q' -> cashingRegisters = false;
				case 'r' -> cr.delete();
				default -> cr.addItem(Double.valueOf(helper));
			}
		} while (cashingRegisters);
	}
}

class CashRegister {
	private double totalPrice;
	private ArrayList<Double> list = new ArrayList<Double>();

	public CashRegister() {
		totalPrice = 0;
	}
	/*
	* Add the price of an item to the register's total.
    */
	public void addItem(double price) {
		totalPrice = totalPrice + price;
		list.add(price);
	}
	/*
	* Return the current total sales amount.
	*/
	public double getTotal() {
		return totalPrice;
	}

	public String show() {
		return list.toString();
	}

	public void delete() {
		list.remove(list.size()-1);
	}
	/*
	* Return the total count of items in the current sale.
	*/
	public int getCount() {
		return list.size();
	}
	/*
	* Clear the register (total and count) for a new sale.
	*/
	public void clear() {
		totalPrice = 0;
		list.clear();
	}
}

