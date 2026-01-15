import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double discountedPrice;
        double discount;
        double originalPrice;

        System.out.print("Enter discounted price: ");
        discountedPrice = sc.nextDouble();

        System.out.print("Enter discount percentage: ");
        discount = sc.nextDouble();

        originalPrice = discountedPrice / (1 - discount / 100);

        System.out.println("Original Price = " + originalPrice);

        sc.close();
    }