import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter R");
        double R = scan.nextDouble();
        System.out.println("Enter H");
        double H = scan.nextDouble();
        double result = Vcylinder(R, H);
        System.out.println("Volume is " + result);
    }

    public static double Vcylinder(double R, double H) {
        double V = 3.14d * R * R * H;
        return V;
    }
}

