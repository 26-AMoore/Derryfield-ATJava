public class FelixBakery {
	public static void main(String[] args) {
		Customer c1 = new Customer("Harvest Market", 1);
		Customer c2 = new Customer("Wegmans", 3);

		c1.addAmount(1004);
		c2.addAmount(423);
		System.out.println(c1.getName() + " spent " + c1.getTotal() + " on " + c1.getCount() + " items, thier serial number is " + c1.getSerial());
		System.out.println(c2.getName() + " spent " + c2.getTotal() + " on " + c2.getCount() + " items, thier serial number is " + c2.getSerial());
	}
}

class Customer {
	private String name;
	private int total = 0, count = 0, reigon = 0, serial;
	private static int lastSerialUsed = 0;

	public Customer(String customer_name, int customer_reigon) {
		name = customer_name;
		reigon = customer_reigon;
		serial = updateSerial();
	} public Customer(String customer_name) {
		this();
		name = customer_name;
	} public Customer() {
		//if we cant steal their data
		name = "N/a";
		reigon = 0;
		serial = updateSerial();
	}

	public int getTotal() {
		return total;
	}

	public int getCount() {
		return count;
	}

	public void addAmount(double amount) {
		total += amount;
		count++;
	}

	public void clearTotal() {
		total = 0;
		count = 0;
	}

	public void setName(String new_name) {
		name = new_name;
	}

	public String getName() {
		return name;
	}

	public void setReigon(int new_reigon) {
		reigon = new_reigon;
	}

	public int getReigon() {
		return reigon;
	}

	public static void lastSerial(int lastSerial) {
		lastSerialUsed = lastSerial;
	}

	private int updateSerial() {
		lastSerialUsed++;
		return lastSerialUsed;
	}

	public int getSerial() {
		return serial;
	}

	public double getTotalTax() {
		return Customer.getTax(reigon) * total;
	}

	public static double getTax(int reigon) {
		return switch (reigon) {
			case 1 -> 0.0000;
			case 2 -> 0.0550;
			case 3 -> 0.0600;
			case 4 -> 0.0625;
			default -> 0;
		};
	}
}
