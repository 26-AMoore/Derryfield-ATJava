public class BaseballCard {
	String name; // the name of the player on the card.
	int year; // the year the card was issued.

	public BaseballCard(String name, int year) {
		this.name = name;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	public String toString() {
		return ("Class: " + this.getClass() + " Year: "+ this.year + " Name: "+ this.name);
	}

	public boolean equals(BaseballCard card2) {
		if (this.name.equals(card2.getName()) && this.year == card2.getYear()) {
			return true;
		} else {
			return false;
		}
	}
}
