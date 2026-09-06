import java.util.Scanner;

class Student {

    String name;
    int[] marks = new int[5];
    int total;
    int percentage;
    String grade;

    void inputDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.println("Enter marks for 5 subjects:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
    }

    void calculateResult() {
        total = 0;

        for (int i = 0; i < 5; i++) {
            total = total + marks[i];
        }

        percentage = total / 5;

        if (percentage >= 90) {
            grade = "A+";
        }
        else if (percentage >= 80) {
            grade = "A";
        }
        else if (percentage >= 70) {
            grade = "B";
        }
        else if (percentage >= 60) {
            grade = "C";
        }
        else if (percentage >= 50) {
            grade = "D";
        }
        else {
            grade = "F";
        }
    }

    void displayResult() {

        System.out.println("\n----- STUDENT RESULT -----");
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total + "/500");
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        if (percentage >= 50) {
            System.out.println("Result: PASS");
        }
        else {
            System.out.println("Result: FAIL");
        }
    }
}

public class CaseStudy1 {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.inputDetails();
        s1.calculateResult();
        s1.displayResult();
    }
}