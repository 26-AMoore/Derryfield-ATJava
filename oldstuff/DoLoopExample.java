import java.util.Scanner;

public class DoLoopExample {
    public static void main(String[] args){
        double value;
        double total = 0;
        Scanner in = new Scanner(System.in);
        
        do {
            System.out.println("How much monye did you spend on that? ");
            value = in.nextDouble();
            if (value < 0){
                value = 0;
            }
            total = total + value;

        } while (value > 0);

        System.out.println("You spent "+ total +", thats a lot");
    }
}
