import java.util.Scanner;

class InvalidMarksException extends Exception {
    InvalidMarksException(String message) {
        super(message);
    }
}

class Student {

    int total;
    int subjects;

    Student() {
        total = 0;
        subjects = 0;
    }

    void addMarks(int marks) throws InvalidMarksException {

        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100");
        }

        total = total + marks;
        subjects++;
    }

    void calculateAverage() {

        if (subjects == 0) {
            throw new ArithmeticException("No subjects entered");
        }

        int average = total / subjects;

        System.out.println("Average marks: " + average);
    }
}

public class CaseStudy3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number of subjects: ");
            int n = sc.nextInt();

            Student s = new Student();

            for (int i = 0; i < n; i++) {
                System.out.print("Enter marks: ");
                int marks = sc.nextInt();

                s.addMarks(marks);
            }

            s.calculateAverage();

        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numbers only.");
        }

        sc.close();
    }
}