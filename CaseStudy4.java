import java.util.Scanner;

class Product {

    int productId;
    String productName;
    int price;
    int quantity;

    int totalCost() {
        return price * quantity;
    }
}

public class CaseStudy4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product p = new Product();

        System.out.print("Enter Product ID: ");
        p.productId = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Product Name: ");
        p.productName = sc.nextLine();

        System.out.print("Enter Price: ");
        p.price = sc.nextInt();

        System.out.print("Enter Quantity: ");
        p.quantity = sc.nextInt();

        int totalBill = p.totalCost();

        System.out.println("\nProduct ID: " + p.productId);
        System.out.println("Product Name: " + p.productName);
        System.out.println("Total Cost: " + totalBill);

        if (totalBill > 5000) {
            double discount = totalBill * 0.10;
            totalBill = totalBill - (int) discount;

            System.out.println("Discount: " + discount);
        }

        System.out.println("Final Bill: " + totalBill);
    }
}