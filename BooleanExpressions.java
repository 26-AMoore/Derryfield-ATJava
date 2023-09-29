public class BooleanExpressions {
    public static void main(String[] args){
        //Evaluate to true or false, not a number
        //boolean flag = true;
        //System.out.println(flag);

        double x = (0.3 * 3 + 0.1);
        double y = 1;
        if (x ==y){
            System.out.println("they the same");
        } else {
            System.out.println(x);
            System.out.println(y);
        }
        //to compare floating points
        final double smallnum = 0.00001;
        if (Math.abs(x-y) < smallnum){
            System.out.println("we did it");
        }
    }

}