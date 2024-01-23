import java.util.Scanner;
public class enumeratedCougarBakeing {
    public static void main(String[] args){

        final double piePrice = 10.00; //defining variables
        Scanner scan;
        int pies;
        double cost = 10.00;
        double discount = .10;
        double totalcost;

        System.out.println("How many pies would you like? Rember that if you buy 3 or more you get a 10% discount");
        scan = new Scanner(System.in);
        pies = scan.nextInt();
        if (pies >= 3){
            totalcost = (pies * cost) * (1 - discount);
            System.out.println("You also get a discount");
        } else {
            totalcost = (pies * cost);
        }
        System.out.println("Your total is: " + totalcost);

    }
}