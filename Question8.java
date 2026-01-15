import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a;
        double b;
        double c;
        double s;
        double area;

        System.out.print("Enter side a: ");
        a = sc.nextDouble();

        System.out.print("Enter side b: ");
        b = sc.nextDouble();

        System.out.print("Enter side c: ");
        c = sc.nextDouble();

        s = (a + b + c) / 2;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Area = " + area);

        sc.close();
    }
}