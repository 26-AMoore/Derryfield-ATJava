import java.util.Scanner;

public class CompoundInterestCalc {
    public static void main(String[] args){
        Scanner scan;
        double cash;
        double intrest;
        double intrestadded;
        int years;
        
        System.out.println("How much money do you have in your bank account? ");
        scan = new Scanner(System.in);
        cash = scan.nextDouble();

        System.out.println("Enter the ARP (as a percentage, for example, 5.5): ");
        scan = new Scanner(System.in);
        intrest = scan.nextDouble();

        System.out.println("How long would you like this to run for? ");
        scan = new Scanner(System.in);
        years = scan.nextInt();

        System.out.printf(" | Year |        Int Earned ($)       |           Balance ($) %n");
		System.out.println("----------------------------------------------------------------");
        for (int i = 1; i < years+1; i++){
            intrestadded = (cash * (intrest / 100));
            cash = cash + intrestadded;
            System.out.printf(" | %4d | %27.2f | %25.2f%n", i, intrestadded, cash);
        }
    }
}
