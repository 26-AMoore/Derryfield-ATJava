import java.util.Scanner;

public class monogramMachine {
    public static void main(String[] args){

        System.out.printf("What is your first name? ");
        Scanner scan = new Scanner(System.in);
         String firstName = scan.next();
        System.out.printf("What is your middle name? ");
        Scanner scan1 = new Scanner(System.in);
        String middleName = scan1.next();
        System.out.printf("What is your last name? ");
        Scanner scan2 = new Scanner(System.in);
        String lastName = scan2.next();

        
        System.out.println("Your monogram is "+firstName.substring(0,1)+middleName.substring(0,1)+lastName.substring(0,1));
    }
}
