import java.util.Scanner;

public class TestAvreageCalculater {
    public static void main(String[] args){
        int i = 1;
        double score; 
        double totalScore = 100;
        Scanner in = new Scanner(System.in);
        do {
            System.out.printf("Input your score for your %d test, or Q to quit: ", i);
            i++;
            score = in.nextDouble();
            totalScore = totalScore + score / 2;
        } while (true);
    }
}


/*
 * Print instructions for the user on how to enter data before looping.
Use a loop to get test scores from user
Assume user enters double values only (no need to do input validation)
User enters a negative number to quit entering data
After the data has been entered, print results:
Print the number of scores that were entered (do not include the negative number)
Print the average test score

 */