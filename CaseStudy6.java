import java.util.Scanner;

class Patient {

    int patientId;
    String name;
    int age;
    double temperature;

    void checkFever() {

        if (temperature > 100.4) {
            System.out.println("Fever");
        } else {
            System.out.println("Normal");
        }
    }

    void displayPatient() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Temperature: " + temperature);
    }
}

public class CaseStudy6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Patient p = new Patient();

        System.out.print("Enter Patient ID: ");
        p.patientId = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Name: ");
        p.name = sc.nextLine();

        System.out.print("Enter Age: ");
        p.age = sc.nextInt();

        System.out.print("Enter Temperature: ");
        p.temperature = sc.nextDouble();

        p.displayPatient();
        p.checkFever();
    }
}