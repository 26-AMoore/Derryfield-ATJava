
public class CustomInterface {
	public static void main(String[] args) {

		Dog Marly = new Dog();
		Marly.setname("Marly");
		Marly.setbreed("Tibetian Terrier");

		Marly.pet();
		Marly.play();
		Marly.sleep();
		System.out.println(Marly.name+" "+Marly.breed);
		
	}
}

interface animal {
	public void setbreed(String dogbreed);
	public void setname(String dogname);

	public void pet();
	public void play();
	public void sleep();
	public void feed();
}

class Dog implements animal {
	String name;
	String breed;
	int happieness = 0;

	public String name(){
		return name;
	}
	public void setname(String dogname){
		name = dogname;
	}
	public void setbreed(String dogbreed){
		breed = dogbreed;
	}
	public int showhappieness(){
		return happieness;
	}
	public String breed(){
		return breed;
	}
	public void pet() {
		happieness++;
	}
	public void play(){
		happieness = happieness + 3;
	}
	public void feed() {
		happieness = happieness + 5;
	}
	public void sleep() {
		happieness = happieness / 2;
	}
	
}
