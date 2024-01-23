import java.util.Scanner;

public class A_Cougarbaking {
    enum dayOfWeek {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY, FALIED}
    public static void main(String[] args){
        Scanner scan;
        double discount;
        double totalcost;
        int inputday;
        dayOfWeek day;
        int personAge;

        System.out.println("What is you age? Remember you get a discount based off of your age: ");
        scan = new Scanner(System.in);
        personAge = scan.nextInt();
        
        System.out.println("Enter day of week (1 = MON, 2 = TUE ... 7=SUN): ");
        scan = new Scanner(System.in);
        inputday = scan.nextInt();

        System.out.println("What is the cost of your meal? ");
        scan = new Scanner(System.in);
        totalcost = scan.nextDouble();

        switch (inputday){
            case 1: 
                day = dayOfWeek.MONDAY; break;
            case 2:
                day = dayOfWeek.TUESDAY; break;
            case 3: 
                day = dayOfWeek.WEDNESDAY; break;
            case 4:
                day = dayOfWeek.THURSDAY; break;
            case 5: 
                day = dayOfWeek.FRIDAY; break;
            case 6:
                day = dayOfWeek.SATURDAY; break;
            case 7 :
                day = dayOfWeek.SUNDAY; break;
            default:
                day = dayOfWeek.FALIED; break;
        }
        if (day == dayOfWeek.MONDAY) {
            if (personAge < 13) {
                discount = 0.075;
            } else if (personAge >= 50){
                discount = 0.15;
            } else {
                discount = 0.05;
            }
        } else {
            if (personAge < 13) {
                discount = 0.05;
            } else if (personAge >= 50){
                discount = 0.075;
            } else {
                discount = 0.00;
            }
        }
        totalcost = totalcost * (1 - discount);
        System.out.println("You classify for our "+ personAge +" rewards program, your discount is "+ discount);
        System.out.println("Your total is: " + totalcost + " have a good "+ day);
    }
}


/*
 * 
 * 
 * 100
 * 10
 * MON
 * 
 * 
 */