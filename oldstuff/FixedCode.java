import java.util.Scanner;

public class FixedCode {
    public static void main(String[] args){
        //Part B

        // prompt user for age.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // are they lucky?
        //original was: if (age = 13) : which is wrong because its not comparing a varable, its trying to set the variable
        if (age == 13) {
            System.out.println("Lucky 13!");
        }

        //Part C
        double a = 1.2; 
        double b= 3.0;
        double c = a * b; 
        //Alternate method is to multiply them each by ten then divide by 100
        /*
         * double c = (a*10)*(b*10) / 100
         * 
         * 
         */
        if(Math.abs(c - 3.6) < 0.000000001){ //Uses a really small offset to stop the floatig point error
            System.out.println("c is 3.6");
        } else {
            System.out.println("c is not 3.6");
        }
        //System.out.println(c); //For Debugging
        //found the issue, c is actually equal to 3.5999999999999996
    }
}
