import java.util.Scanner;

class employee {

    int employeeId;
    String name;
    int basicSalary;

    void calculateSalary() {

        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.10;
        double grossSalary = basicSalary + hra + da;

        System.out.println("\nEmployee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + grossSalary);
    }
}

public class CaseStudy3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        employee e = new employee();

        System.out.print("Enter Employee ID: ");
        e.employeeId = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Name: ");
        e.name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        e.basicSalary = sc.nextInt();

        e.calculateSalary();
    }
}