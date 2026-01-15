import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double price;
        double discount;
        double finalPrice;

        System.out.print("Enter original price: ");
        price = sc.nextDouble();

        System.out.print("Enter discount percentage: ");
        discount = sc.nextDouble();

        finalPrice = price - (price * discount / 100);

        System.out.println("Discounted Price = " + finalPrice);

        sc.close();
    }