import java.util.Scanner;

public class CaseStudy7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int correctPin = 1234;
        int balance = 5000;
        int attempts = 0;
        boolean access = false;

        while (attempts < 3) {

            System.out.print("Enter PIN: ");
            int pin = sc.nextInt();

            if (pin == correctPin) {
                access = true;
                break;
            } else {
                attempts++;
                System.out.println("Incorrect PIN");
            }
        }

        if (access) {

            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Display Balance");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Enter amount: ");
                int amount = sc.nextInt();

                if (amount <= balance) {
                    balance = balance - amount;
                    System.out.println("Withdrawal successful");
                } else {
                    System.out.println("Insufficient Balance");
                }

            } else if (choice == 2) {

                System.out.print("Enter amount: ");
                int amount = sc.nextInt();

                balance = balance + amount;
                System.out.println("Deposit successful");

            } else if (choice == 3) {

                System.out.println("Balance: " + balance);

            } else {
                System.out.println("Invalid choice");
            }

        } else {
            System.out.println("Maximum PIN attempts reached");
        }
    }
}