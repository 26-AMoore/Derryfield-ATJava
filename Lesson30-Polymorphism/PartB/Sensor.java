public abstract class Sensor {
	private int modelNumber;
	private Strign name;

	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}

	public int getModelNumber() {
		return modelNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public abstract recordMeasurements();
}
