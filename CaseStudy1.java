import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

class InvalidSeatsException extends Exception {
    InvalidSeatsException(String message) {
        super(message);
    }
}

class InsufficientSeatsException extends Exception {
    InsufficientSeatsException(String message) {
        super(message);
    }
}

class BusBooking {

    int age;
    int seats;
    int availableSeats;

    BusBooking(int age, int seats) {
        this.age = age;
        this.seats = seats;
        this.availableSeats = 40;
    }

    void bookTicket() throws InvalidAgeException, InvalidSeatsException, InsufficientSeatsException {

        if (age <= 0) {
            throw new InvalidAgeException("Invalid age");
        }

        if (seats <= 0) {
            throw new InvalidSeatsException("Invalid number of seats");
        }

        if (seats > availableSeats) {
            throw new InsufficientSeatsException("Insufficient seats available");
        }

        System.out.println("Ticket booked successfully");
        System.out.println("Passenger Age: " + age);
        System.out.println("Seats Booked: " + seats);
        System.out.println("Seats Remaining: " + (availableSeats - seats));
    }
}

public class CaseStudy1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter passenger age: ");
            int age = sc.nextInt();

            System.out.print("Enter number of seats: ");
            int seats = sc.nextInt();

            BusBooking b = new BusBooking(age, seats);

            b.bookTicket();

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());

        } catch (InvalidSeatsException e) {
            System.out.println(e.getMessage());

        } catch (InsufficientSeatsException e) {
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numbers only.");
        }

        sc.close();
    }
}