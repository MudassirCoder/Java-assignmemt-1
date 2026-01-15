import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        double volts;
        double amps;
        double watts;

        System.out.print("Enter voltage: ");
        volts = a.nextDouble();

        System.out.print("Enter current: ");
        amps = a.nextDouble();

        watts = volts * amps;

        System.out.println("Power = " + watts + " Watts");

        a.close();
    }
}