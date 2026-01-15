import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius;
        double area;
        double circumference;

        System.out.print("Enter radius: ");
        radius = sc.nextDouble();

        area = 3.14 * radius * radius;
        circumference = 2 * 3.14 * radius;

        System.out.println("Area = " + area);
        System.out.println("Circumference = " + circumference);

        sc.close();
    }
}