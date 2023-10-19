import java.util.Scanner;

public class WeekdayCougarBakeingCompany {
    public static void main(String[] args){
        final double cookiePrice = 0.99; //defining variables
        Scanner scan;
        double cookies;
        double discount;
        double totalcost;
        int aage;
        enum age {CHILD, ADULT, SENIOR}

        System.out.println("How many pies would you like? ");
        scan = new Scanner(System.in);
        cookies = scan.nextInt();

        System.out.println("What is you age? Remember you get a discount based off of your age: ");
        scan = new Scanner(System.in);
        cookies = scan.nextInt();

        if (true) {
            discount = 0.15;
        } else if (cookies > 12){
            discount = 0.05;
        } else if (cookies > 6){
            discount = 0.025;
        } else {
            discount = 1;
        }
        totalcost = (cookies * cookiePrice * (1 - discount)*100);
        System.out.println("Your total is: " + (int)totalcost/100);


    }
}
