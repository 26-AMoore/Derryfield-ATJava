public class PartC {
	public static void main(String[] args) {
		Customer.lastSerial(100);
		Customer c1 = new Customer("Sal's Deli");
		c1.addAmount(100);
		Customer c2 = c1;
		c2.addAmount(50);
		System.out.println(c1.getTotal());
		System.out.println(c2.getTotal());
	}
}

//They output is the same for both of the System.out.println()'s it prints 150, because c2 is a refrence to c1, which is a refrece to the actuall Customer objec 
