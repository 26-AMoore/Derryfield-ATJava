import java.util.Scanner;

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
    static String input = "";

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

    static public void parseit() {
        
        Scanner scan;

        System.out.println("What is the input?" + //
                "(Order is Dashboard switches for left and right sliding door, child lock, and master unlock (0 for off or 1 for activated)\n" + //
                "Inside handles on the left and right sliding doors (0 or 1)\n" + //
                "Outside handles on the left and right sliding doors (0 or 1)\n" + //
                "The gear shift setting (one of P N D 1 2 3 R)): ");
        scan = new Scanner(System.in);
        input = scan.next();
                //Parse it into Booleans
               if (input.charAt(0) == '0'){dashLeft = false;
        } else if (input.charAt(0) == '1'){dashLeft = true;
        } if (input.charAt(1) == '0'){dashRight = false;
        } else if (input.charAt(1) == '1'){dashRight = true;
        } if (input.charAt(2) == '0'){childLock = false;
        } else if (input.charAt(2) == '1'){childLock = true;
        } if (input.charAt(3) == '0'){masterLock = false;
        } else if (input.charAt(3) == '1'){masterLock = true;
        } if (input.charAt(4) == '0'){leftDoorInside = false;
        } else if (input.charAt(4) == '1'){leftDoorInside = true;
        } if (input.charAt(5) == '0'){rightDoorInside = false;
        } else if (input.charAt(5) == '1'){rightDoorInside = true;
        } if (input.charAt(6) == '0'){leftDoorOutside = false;
        } else if (input.charAt(6) == '1'){leftDoorOutside = true;
        } if (input.charAt(7) == '0'){rightDoorOutside = false;
        } else if (input.charAt(7) == '1'){rightDoorOutside = true;
        }

        //for the gear shift
               if (input.charAt(8) == 'P'){gearShift = gearShift.P;
        } else if (input.charAt(8) == 'N'){gearShift = gearShift.N;
        } else if (input.charAt(8) == 'D'){gearShift = gearShift.D;
        } else if (input.charAt(8) == '1'){gearShift = gearShift.one;
        } else if (input.charAt(8) == '2'){gearShift = gearShift.two;
        } else if (input.charAt(8) == '3'){gearShift = gearShift.three;
        } else if (input.charAt(8) == 'R'){gearShift = gearShift.R;
        } else {System.out.println("please just kill me");}
        System.out.println("Finished Parsing");


        //System.out.printf("leftDoorIsOpen %b rightDoorIsOpen %b%n masterLock %b leftDoorOutside %b%n rightDoorInside %b dashleft %b%n rightDoorOutside %b childLock %b%n dashRight %b gearShift " + gearShift ,leftDoorIsOpen, rightDoorIsOpen, masterLock, leftDoorOutside, leftDoorOutside, rightDoorInside, dashLeft, rightDoorOutside, childLock, dashRight);

    }

    public static void dothestuff(){

			/*A minivan has two sliding doors.
			 * Each door can be opened by either a dashboard switch,
			 * its inside handle, or its outside handle.
			 * However, the inside handles do not work if a child lock switch is activated.
			 * In order for the sliding doors to open, the gear shift must be in park,
			 * and the master unlock switch must be activated. */
			if (gearShift == gearShift.P && masterLock){
				if (leftDoorInside || leftDoorOutside){
				leftDoorIsOpen = true;
				}
				if (rightDoorInside || rightDoorOutside){
				rightDoorIsOpen = true;
				}
		}
    }

    public static void main(String[] args){
        parseit();
        dothestuff();
        leftDoor();
        rightDoor();
		if (leftDoorIsOpen && rightDoorIsOpen){
			System.out.println("Left and Right Door Openening");
		}else if (leftDoorIsOpen){
			System.out.println("Left Door Openening");
		}else if (rightDoorIsOpen){
			System.out.println("Right Door Openening");
		} else {
			System.out.println("Nothing Opens");
		}
    }
}

