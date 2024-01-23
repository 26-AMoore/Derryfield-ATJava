public class NestedLoopExample {
    public static void main(String[] args){
        int colume = 1;
        int row = 1;
        int rowMax = 5;
        int columeMax = 5;
        while (row < rowMax) {
            System.out.printf(" %3d ", (row * colume));
            row++;
            if (row >= rowMax){
                row = 1;
                colume++;
                System.out.printf("%n");
            }
            if (colume >= columeMax){
                row = rowMax + 1;
            }
        }
    }
}