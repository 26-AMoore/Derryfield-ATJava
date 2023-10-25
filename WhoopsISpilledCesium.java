import java.util.Scanner;

public class WhoopsISpilledCesium {
    public static void main(String[] args){
        double cesiumPercent = 100;
        Scanner scan;
        int years = 0;
        double cesium;

        System.out.println("HOW MUCH CESIUM DID YOU SPILL!!?!?! ");
        scan = new Scanner(System.in);
        cesium = scan.nextDouble();

        while (cesiumPercent > 1.0){
            cesiumPercent = cesiumPercent / 2;
            years = years + 30;
        }

        if (cesiumPercent < 1.0){
            System.out.println("YOUR A MANIAC, THATS GONNA TAKE " + years + " YEARS TO DECAY DOWN TO " + cesiumPercent + "% LEFT WHICH IS " + (cesium * cesiumPercent) + " Grams");
        }
    }
}


/*The half life of Cesium 90, a dangerous radioactive isotope released in the Fukushima reactor accident,
is 30 years. That is, half of its radioactive material will decay every 30 years. 
Write a Java program that uses a while loop to calculate how many years it will take before 99% of the original cesium will be gone.
Assume that you begin with 100.0% of the material.
After 30 each 30 year period has passed, assume the material is equal to its previous amount divided by 2.
Determine what your test condition should be for your loop.
Print the number of years required (should be a multiple of 30) and the amount of material leftover (as a percentage).
 */