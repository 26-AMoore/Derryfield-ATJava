public class GearedBicycle extends Bicycle {
	private static final int MAX_GEAR = 6;
	private int gear;

	public GearedBicycle(int gear) {
		this.gear = gear;
	} public GearedBicycle() {
		this.gear = 1;
	}
	public void setGear(int gear) {
		if (gear < 7 && gear > 0) {
			this.gear = gear;
		}
	}
	public int getGear() {
		return gear;
	}
	public void shiftUp() {
		changeGear(1);
	}
	public void shiftDown() {
		changeGear(-1);
	}
	private void changeGear(int change) {
		if (gear + change < MAX_GEAR + 1 && gear + change > 0) {
			gear += change;
		}
	}

	public void display() {
		System.out.println("Gear: " + gear);
		super.display();
	}

	public void pedal() {
		int newSpeed;
		newSpeed = getSpeed() + getGear();
		setSpeed(newSpeed);
	}
}
