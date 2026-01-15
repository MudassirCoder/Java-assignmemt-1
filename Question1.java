import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double obtained;
        double total;
        double percentage;

        System.out.print("Enter obtained marks: ");
        obtained = sc.nextDouble();

        System.out.print("Enter total marks: ");
        total = sc.nextDouble();

        percentage = (obtained / total) * 100;

        System.out.println("Percentage = " + percentage);

        sc.close();
    }
}