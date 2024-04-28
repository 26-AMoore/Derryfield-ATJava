public class SavingsAccount extends Account {
	private double FEE_AMMOUNT;
	private final double FEE_THRESHOLD = 10000;

	public SavingsAccount(int id, double initBalance) {
		super(id, initBalance);
	}

	public void setFee(double fee) {
		this.FEE_AMMOUNT = fee;
	}

	public void deductFees() {
		if (getBalance() < FEE_THRESHOLD) {
			setBalance(getBalance() - FEE_AMMOUNT);
		}
	}
	
}
