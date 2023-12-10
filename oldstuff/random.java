import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        int times;
        Scanner in = new Scanner(System.in);
        System.out.printf("How many random numbers would you like: ");
        times = in.nextInt();
        for (int i = 0; i < times; i++){
            System.out.println(Math.random());
        }
    }
}
