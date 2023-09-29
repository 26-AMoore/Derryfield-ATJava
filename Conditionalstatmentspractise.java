import java.util.Scanner;
public class Conditionalstatmentspractise {
    public static void main(String[] args) {
        //if statements and what not
        System.out.println("what is your age?"); //gets the users age
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt(); //turns age to int
        if (age > 49 | age < 10){
            System.out.println("Congratulations, you qualify for the senior discount"); //conditional
        } else {
            System.out.println("were sorry, you do not qualify for this discound"); //conditional
        }
        System.out.println("what would you like to buy? "); //not conditional
    }
}
