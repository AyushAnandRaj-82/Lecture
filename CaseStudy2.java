import java.util.Scanner;

class Bank {

    int accountNumber;
    String name;
    int balance;

    void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Amount deposited");
    }

    void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance = balance - amount;
            System.out.println("Amount withdrawn");
        }
    }

    void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}

public class CaseStudy2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Bank b = new Bank();

        System.out.print("Enter Account Number: ");
        b.accountNumber = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Name: ");
        b.name = sc.nextLine();

        System.out.print("Enter Balance: ");
        b.balance = sc.nextInt();

        System.out.print("Enter Deposit Amount: ");
        int deposit = sc.nextInt();
        b.deposit(deposit);

        System.out.print("Enter Withdraw Amount: ");
        int withdraw = sc.nextInt();
        b.withdraw(withdraw);

        b.displayBalance();
    }
}