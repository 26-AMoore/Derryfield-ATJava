import java.util.ArrayList;
//if i need to sort, import the collections package

public class notes {
	public static void main(String[] args) {
		//Array list is a form of a generic class, A class that can work with most class
		// V class  V type paramater
		ArrayList<String> names = new ArrayList<String>();
		names.add("Sam");
		names.add("Paul");
		names.add("Jon");

//		System.out.println(names);
//		System.out.println(names.size());

		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(47);
		System.out.println(nums);
	}
}
