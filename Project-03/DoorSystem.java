import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class DoorSystem {
    static boolean leftDoorIsOpen;
    static boolean rightDoorIsOpen;
    static boolean leftDoorInside; 
    static boolean masterLock;
    static boolean leftDoorOutside;
    static boolean rightDoorInside;
    static boolean dashLeft;
    static boolean rightDoorOutside;
    static boolean childLock;
    static boolean dashRight;

    static enum gearShift {P, N, D, one, two, three, R};
    static gearShift gearShift;

    public static boolean leftDoor(){
        if (leftDoorIsOpen == true) {
            return true;
        } else {
            return false;
        }
    }


     public static boolean rightDoor(){
        if (rightDoorIsOpen == true) {
            return true;
        } else {
            return false;
        }
    }
        
    public static void main(String[] args){
        Scanner scan;
        String input;

        System.out.println("What is the input?" + //
                "(Order is Dashboard switches for left and right sliding door, child lock, and master unlock (0 for off or 1 for activated)\n" + //
                "Inside handles on the left and right sliding doors (0 or 1)\n" + //
                "Outside handles on the left and right sliding doors (0 or 1)\n" + //
                "The gear shift setting (one of P N D 1 2 3 R)): ");
        scan = new Scanner(System.in);
        input = scan.next();

                //Get all the boolean values
               if (input.charAt(0) == (char) 0){dashLeft = false;
        } else if (input.charAt(0) == (char) 1){dashLeft = true;
        } else if (input.charAt(1) == 0){dashRight = false;
        } else if (input.charAt(1) == 1){dashRight = true;
        } else if (input.charAt(2) == 0){childLock = false;
        } else if (input.charAt(2) == 1){childLock = true;
        } else if (input.charAt(3) == 0){masterLock = false;
        } else if (input.charAt(3) == 1){masterLock = true;
        } else if (input.charAt(4) == 0){leftDoorInside = false;
        } else if (input.charAt(4) == 1){leftDoorInside = true;
        } else if (input.charAt(5) == 0){rightDoorInside = false;
        } else if (input.charAt(5) == 1){rightDoorInside = true;
        } else if (input.charAt(6) == 0){leftDoorOutside = false;
        } else if (input.charAt(6) == 1){leftDoorOutside = true;
        } else if (input.charAt(7) == 0){rightDoorOutside = false;
        } else if (input.charAt(7) == 1){rightDoorOutside = true;
        }

        //for the gear shift
        if (input.substring(8,9) == "P"){gearShift = gearShift.P;
        } else if (input.substring(8,9) == "N"){gearShift = gearShift.N;
        } else if (input.substring(8,9) == "D"){gearShift = gearShift.D;
        } else if (input.charAt(8) == 1){gearShift = gearShift.one;
        } else if (input.charAt(8) == 2){gearShift = gearShift.two;
        } else if (input.charAt(8) == 3){gearShift = gearShift.three;
        } else if (input.substring(8,8) == "R"){gearShift = gearShift.R;
        }
        System.out.println("Finished Parsing");


        System.out.printf("leftDoorIsOpen %b rightDoorIsOpen %b%n masterLock %b leftDoorOutside %b%n rightDoorInside %b dashleft %b%n rightDoorOutside %b childLock %b%n dashRight %b gearShif " + gearShift ,leftDoorIsOpen, rightDoorIsOpen, masterLock, leftDoorOutside, leftDoorOutside, rightDoorInside, dashLeft, rightDoorOutside, childLock, dashRight);
    }
}