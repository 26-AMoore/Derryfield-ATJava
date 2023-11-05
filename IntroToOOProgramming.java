class Dog {
	String name = "";
	String breed = "";
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
	public String showbreed(){
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






public class IntroToOOProgramming {
	public static void main(String[] args) {

		Dog Kyotio = new Dog();
		Kyotio.setname("Kyotio");
		Kyotio.setbreed("German Shepard");
		System.out.println(Kyotio.happieness+" "+Kyotio.breed+" "+Kyotio.name);

	}
}
