package techImmortal.chapterfour.ifElse;

import java.util.Scanner;

public class TicketTest {
    /**
     Todo 🚦 Exercise: Movie Ticket Price Calculator
      Write a Java program that calculates the movie ticket price based on a customer’s age and time of day.
      Rules:
      Standard ticket price = #10,000.
      Children under 12 years old pay 40%.
      Seniors (65 and above) pay 40% less.
      If the movie is a matinee (before 5 PM), everyone gets an extra 20% discount.
     **/
    public static void main(String[] args) {
        System.out.println("Esteemed customer, welcome to TechImmortal Cinema!");
        System.out.println("Kindly enter your age: ");
        Scanner scanner = new Scanner(System.in);
        int customerAge = scanner.nextInt();
        System.out.println("What time is the movie? (Please enter in 24-hour format, e.g., 14 for 2 PM): ");
        int movieTime = scanner.nextInt();

        Ticket ticket = new Ticket(customerAge, movieTime);

        System.out.println("Your ticket price is: ₦" + ticket.getPrice());
    }


}
