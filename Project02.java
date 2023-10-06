import java.util.Scanner;
public class Project02 {
    public static void main(String[] args){

        //Defining variables
        Scanner scan;
        int ttime;
        int seconds;
        int minutes;
        int hours;

        System.out.printf("How much time is there in seconds? ");
        scan = new Scanner(System.in);
        ttime = scan.nextInt();
        seconds = ttime % 60;
        minutes = ttime / 60 % 60;
        hours = ttime / 60 / 60;
        System.out.printf("%02S:%02S:%02S", hours, minutes, seconds);

    }
}