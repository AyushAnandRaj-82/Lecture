import java.util.Scanner;

class Book {

    int bookId;
    String title;
    String author;
    boolean available = true;

    void issueBook() {
        if (available) {
            available = false;
            System.out.println("Book issued successfully");
        } else {
            System.out.println("Book is already issued");
        }
    }

    void returnBook() {
        available = true;
        System.out.println("Book returned successfully");
    }

    void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);

        if (available) {
            System.out.println("Status: Available");
        } else {
            System.out.println("Status: Issued");
        }
    }
}

public class CaseStudy5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Book b = new Book();

        System.out.print("Enter Book ID: ");
        b.bookId = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Book Title: ");
        b.title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        b.author = sc.nextLine();

        b.issueBook();
        b.issueBook();

        b.returnBook();

        b.displayBook();
    }
}