package zoo;

public class Mammal {
	private String name;
	private double weight;

	public Mammal(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}
}
