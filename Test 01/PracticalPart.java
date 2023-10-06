//Alex's Code
import java.util.Scanner;

public class PracticalPart {
    public static void main(String[] args){

        //Declaring variables
        Scanner scan;
        String name;
        double x;
        double y;
        double z;

        //takeing input
        System.out.printf("Enter your name: ");
        scan = new Scanner(System.in);
        name = scan.next();
        System.out.printf("Hello %s! Enter in three numbers: ",name);
        scan = new Scanner(System.in);
        x = scan.nextDouble();
        y = scan.nextDouble();
        z = scan.nextDouble();
        //Giving output
        System.out.printf("x = %11.3f%ny = %11.3f%nz = %11.3f %n",x,y,z);
    }
}