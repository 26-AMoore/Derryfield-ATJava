import java.util.Scanner;
public class Project02 {
    public static void main(String[] args){

        //Defining variables
        Scanner scan;
        int ttime;
        int seconds;
        int minutes;
        int hours;

        //input
        System.out.printf("How much time is there in seconds? ");
        scan = new Scanner(System.in);
        ttime = scan.nextInt();

        //maths
        hours = ((ttime / 60) / 60);
        minutes = ((ttime / 60) % 60); 
        seconds = (ttime % 60);
        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);

    }
}