import java.util.Scanner;

public class NumeralTranslator {
    public static void main(String[] args){
        Scanner input;
        int number = 0;
        int thousands;
        int hundreds;
        int tens;
        int ones;
        boolean gottheinput = false;
        int checker;
        String sones;
        String stens;
        String shundreds;
        String sthousands;


        System.out.println("numbers??????? ");
        input = new Scanner(System.in);

        //input validation
        while (gottheinput == false){
            if (input.hasNextInt()){
                checker = input.nextInt();
                
                if (checker < 4000 && checker > 0) {
                    number = checker;
                    gottheinput = true;
                } else if (checker > 4000) {
                    System.out.println("It also needs to be below 4000");
                } else if (checker < 0) {
                    System.out.println("It also needs to be above 0");
                } else {
                    System.out.println("I got no clue how the heck you goofed this");
                }

            } else {
                System.out.println("Please enter a valid number");
                System.out.printf("numbers???????? ");
                input = new Scanner(System.in);
            }
            
        }

        //Maths
        thousands = (number / 1000);
        hundreds = number % 1000 / 100;
        tens = number % 1000 % 100 / 10;
        ones = number % 1000 % 100 % 10;
        System.out.printf("%d %d %d %d%n",thousands,hundreds,tens,ones);

        //Translation
        sones = switch (ones) {
            case 1 -> "I";
            case 2 -> "II";
            case 3 -> "III";
            case 4 -> "IV";
            case 5 -> "V";
            case 6 -> "VI";
            case 7 -> "VII";
            case 8 -> "VIII";
            case 9 -> "IX";
            case 0 -> "";

            default -> "no";
        };
        stens = switch (tens) {
            case 1 -> "X";
            case 2 -> "XX";
            case 3 -> "XXX";
            case 4 -> "XL";
            case 5 -> "L";
            case 6 -> "LX";
            case 7 -> "LXX";
            case 8 -> "LXXX";
            case 9 -> "LC";
            case 0 -> "";

            default -> "no";
        };
        shundreds = switch (hundreds) {
            case 1 -> "C";
            case 2 -> "CC";
            case 3 -> "CCC";
            case 4 -> "CD";
            case 5 -> "D";
            case 6 -> "DC";
            case 7 -> "DCC";
            case 8 -> "DCCC";
            case 9 -> "DM";
            case 0 -> "";

            default -> "no";
        };
        sthousands = switch (thousands) {
            case 1 -> "M";
            case 2 -> "MM";
            case 3 -> "MMM";
            case 0 -> "";
            
            default -> "no";
        };
        System.out.printf("%s%s%s%s%n",sthousands,shundreds,stens,sones);
    }
}