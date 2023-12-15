import java.util.Arrays;
import java.util.Scanner;

public class PartC {
	public static void main(String[] args) {
		int[] array = new int[1000000];
		int target = 0;
		int location = 0;
		long start;
		long end;
		long linearSearch = 0;
		long myBinarySearch;
		long binarySearch;
		long sortTime;
		Scanner in = new Scanner(System.in);
		boolean isValid = false;

		//Making array & getting target
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * array.length);
		}
		System.out.println("What is the target? (Values range from 0 - " + array.length + ")");
		target = in.nextInt();

		//linearSearch && making sure the target exists
		while (!isValid) {
			start = System.currentTimeMillis();
			location = linearSearch(array, target);
			end = System.currentTimeMillis() - start;
			linearSearch = end;
			if (location != -1) {
				isValid = true;
			} else {
				System.out.println("That number was not found, please try again");
				target = in.nextInt();
			}
		}

		System.out.print("\033[H\033[2J");
		System.out.println("the first instance of the target is at " + location);
		System.out.println("value at that adress: " + array[location]);
		System.out.println("time: " + linearSearch);
		
		//My custom binary search
		System.out.println("----- Now for my binary search -----");
		start = System.currentTimeMillis();
		Arrays.sort(array);
		end = System.currentTimeMillis();
		sortTime = end - start;

		start = System.currentTimeMillis();
		location = BSearch(array, target);
		end = System.currentTimeMillis() - start;

		myBinarySearch = end;
		System.out.println("this value is at " + location);
		System.out.println("value at that adress: " + array[location]);
		System.out.println("time: " + myBinarySearch);
		System.out.println("the time to sort was: "+ sortTime);
		
		//The array class's binary search
		System.out.println("----- Now the Array class's sort -----");
		start = System.currentTimeMillis();
		location = Arrays.binarySearch(array, target);
		end = System.currentTimeMillis();

		binarySearch = end - start;
		System.out.println("this value is at " + location);
		System.out.println("value at that adress: " + array[location]);
		System.out.println("time: " + binarySearch);
//		System.out.println("");
//		System.out.println("highest number was " + array[array.length - 1]);
//		System.out.println("lowest number was " + array[0]);
		
	}
	//My binary search
	public static int BSearch(int[] array, int target) {
		int largest = array.length;
		int lowest = 0;
		int mid = array.length / 2;
		boolean found = false;
		
		while (!found) {
			if (target == array[mid]) {
				return mid;
			} else if (target > array[mid]) {
				lowest = mid;
				mid = ((largest - lowest) / 2) + lowest;
			} else if (target < array[mid]) {
				largest = mid;
				mid = (largest - lowest) / 2;
			}
		}
		return 0;
	}

	//My linear Search
	public static int linearSearch(int[] array, int target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				return i;
			}
		}
		System.out.println("Failed, target not found");
		return -1;
	}
}
