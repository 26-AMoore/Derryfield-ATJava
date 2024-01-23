import java.util.Scanner;

public class B_Cougarbaking {
    enum age {CHILD, ADULT, SENIOR}
    enum dayOfWeek {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY, FALIED}
    public static void main(String[] args){
        Scanner scan;
        double discount;
        double totalcost;
        age aage;
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
                aage = age.CHILD;
            } else if (personAge >= 50){
                discount = 0.15;
                aage = age.SENIOR;
            } else {
                discount = 0.05;
                aage = age.ADULT;
            }
        } else {
            if (personAge < 13) {
                discount = 0.05;
                aage = age.CHILD;
            } else if (personAge >= 50){
                discount = 0.075;
                aage = age.SENIOR;
            } else {
                discount = 0.00;
                aage = age.ADULT;
            }
        }
        totalcost = totalcost * (1 - discount);
        System.out.println("You classify for our "+ aage +" rewards program, your discount is "+ discount);
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