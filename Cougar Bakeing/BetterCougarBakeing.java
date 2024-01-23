/*
The Cougar Baking Company is growing and has expanded their offerings.  
Write a program that calculates and displays the total cost for cookies:
Cookies are $0.99 apiece.
If you purchase > 6 cookies, you get a 2.5% discount on your total order.
If you purchase > 12 cookies, you get a 5% discount on your total order.
If you purchase > 24 cookies you get a 15% discount on your total order
Write and test your program.  Submit your source file for grading using MSA or GitHub.
*/

import java.util.Scanner;

public class BetterCougarBakeing {
    public static void main(String[] args){
        final double cookiePrice = 0.99; //defining variables
        Scanner scan;
        double cookies;
        double discount;
        double totalcost;

        System.out.println("How many Cookies would you like? Rember that you get a discount based off how many you buy: ");
        scan = new Scanner(System.in);
        cookies = scan.nextInt();
        if (cookies > 24) {
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
