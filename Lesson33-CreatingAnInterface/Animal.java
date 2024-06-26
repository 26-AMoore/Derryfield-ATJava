import java.util.ArrayList;
import java.util.Comparator;

public class Animal implements Comparator<Animal> {
	private String name;
	private double weight;

	public Animal(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String toString() {
		String s = this.getClass().getName() +
			String.format(" [name = %s, weight (lbs) = %.2f]", name, weight);
		return s;
	}

	public static double calcAvg(ArrayList<Animal> list) {
		double sum = 0;
		if (list.size() == 0) {
			return 0;
		}
		for (Animal animal : list) {
			sum = sum + animal.getWeight();
		}
		return sum / list.size();
	}

	public int compare(Animal a, Animal b) {
		double small = .0000001;
		if (Math.abs(b.getWeight() - a.getWeight()) < small) {
			return 0;
		} else if (b.getWeight() > a.getWeight()) {
			return 1;
		} else {
			return -1;
		}
	}
}
