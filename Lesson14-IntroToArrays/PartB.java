//Write a program that creates an array of doubles called numbers using the following initial values:
//
//	{ 2.2, 1.0, 3.7, 4.1, 88.0 }
//
//Use an enhanced for loop to iterate through array and to print the value of each element:
//
//2.2
//1.0 
//3.7 
//4.1 
//88.0

public class PartB {
	public static void main(String[] args) {
		double[] array = {2.2, 1.0, 3.7, 4.1, 88.0};
		for (double var : array) {
			System.out.println(var);
		}
	}
}
