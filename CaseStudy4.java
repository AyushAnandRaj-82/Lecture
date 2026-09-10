import java.util.Scanner;

class InvalidPriceException extends Exception {
    InvalidPriceException(String message) {
        super(message);
    }
}

class InvalidQuantityException extends Exception {
    InvalidQuantityException(String message) {
        super(message);
    }
}

class InvalidDiscountException extends Exception {
    InvalidDiscountException(String message) {
        super(message);
    }
}

class PaymentException extends Exception {
    PaymentException(String message) {
        super(message);
    }
}

class Shopping {

    int price;
    int quantity;
    int discount;

    Shopping(int price, int quantity, int discount) {
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }

    void calculateBill(int payment) throws InvalidPriceException,
            InvalidQuantityException, InvalidDiscountException, PaymentException {

        if (price <= 0) {
            throw new InvalidPriceException("Invalid product price");
        }

        if (quantity <= 0) {
            throw new InvalidQuantityException("Invalid quantity");
        }

        if (discount < 0 || discount > 100) {
            throw new InvalidDiscountException("Invalid discount percentage");
        }

        int total = price * quantity;
        int finalAmount = total - (total * discount / 100);

        if (payment < finalAmount) {
            throw new PaymentException("Payment amount is less than the bill");
        }

        System.out.println("Total amount: " + total);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final amount: " + finalAmount);
        System.out.println("Payment successful");
        System.out.println("Change: " + (payment - finalAmount));
    }
}

public class CaseStudy4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter product price: ");
            int price = sc.nextInt();

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            System.out.print("Enter discount percentage: ");
            int discount = sc.nextInt();

            System.out.print("Enter payment amount: ");
            int payment = sc.nextInt();

            Shopping s = new Shopping(price, quantity, discount);

            s.calculateBill(payment);

        } catch (InvalidPriceException e) {
            System.out.println(e.getMessage());

        } catch (InvalidQuantityException e) {
            System.out.println(e.getMessage());

        } catch (InvalidDiscountException e) {
            System.out.println(e.getMessage());

        } catch (PaymentException e) {
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numbers only.");
        }

        sc.close();
    }
}