import java.util.Scanner;
public class SpecificHeatCalc {
    public static void main(String[] args){
        Scanner scan;
        double M;
        double WM;
        double WT;
        double SH;
        double T1;
        double T2;
        double T3;
        System.out.println("give me some inputs baby");
        System.out.printf("What is Mass: ");
        scan = new Scanner(System.in);
        M = scan.nextDouble();
        System.out.printf("Whats the inital metal temp: ");
        scan = new Scanner(System.in);
        T1 = scan.nextDouble();
        System.out.printf("Whats the final temp: ");
        scan = new Scanner(System.in);
        T2 = scan.nextDouble();
        System.out.printf("Whats the Water mass: ");
        scan = new Scanner(System.in);
        WM = scan.nextDouble();
        System.out.printf("Whats the inital water temp: ");
        scan = new Scanner(System.in);
        WT = scan.nextDouble();

        //To find Q
        double Q = (Math.abs(WT - T2)*4.184*WM);
        System.out.println("SH = "+Q /(Math.abs(T1-T2) * M));

}}
