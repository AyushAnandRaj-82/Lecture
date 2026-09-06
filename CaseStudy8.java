import java.util.Scanner;

class Employee {

    String name;
    int salary;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {

    int bonus;

    void displayManager() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + (salary + bonus));
    }
}

public class CaseStudy8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Manager m = new Manager();

        System.out.print("Enter Name: ");
        m.name = sc.nextLine();

        System.out.print("Enter Salary: ");
        m.salary = sc.nextInt();

        System.out.print("Enter Bonus: ");
        m.bonus = sc.nextInt();

        m.displayManager();
    }
}