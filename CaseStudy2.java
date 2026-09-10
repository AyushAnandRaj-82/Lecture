import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

class InvalidAmountException extends Exception {
    InvalidAmountException(String message) {
        super(message);
    }
}

class BankAccount {

    int balance;

    BankAccount(int balance) {
        this.balance = balance;
    }

    void withdraw(int amount) throws InsufficientBalanceException, InvalidAmountException {

        if (amount <= 0) {
            throw new InvalidAmountException("Invalid withdrawal amount");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance");
        }

        balance = balance - amount;

        System.out.println("Withdrawal successful");
        System.out.println("Remaining balance: " + balance);
    }
}

public class CaseStudy2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter balance: ");
            int balance = sc.nextInt();

            System.out.print("Enter withdrawal amount: ");
            int amount = sc.nextInt();

            BankAccount b = new BankAccount(balance);

            b.withdraw(amount);

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());

        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numbers only.");
        }

        sc.close();
    }
}