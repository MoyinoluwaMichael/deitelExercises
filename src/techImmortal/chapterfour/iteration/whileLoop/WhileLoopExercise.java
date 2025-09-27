package techImmortal.chapterfour.iteration.whileLoop;

import java.util.Scanner;

public class WhileLoopExercise {
    /*
Todo    Exercise: Sum of Positive Numbers
    Write a Java program that keeps asking the user to enter numbers.
    The program should add up all positive numbers entered.
    If the user enters a negative number, the program should stop and display the total sum.
    */
    public static void main(String[] args) {
        System.out.print("Esteemed user, enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int totalSum = 0;

        while (number > 0) {
            totalSum += number;
            System.out.print("Esteemed user, enter a number: ");
            number = scanner.nextInt();
        }

        System.err.println("You entered a negative number, exiting...");
        System.out.println("The total sum of positive numbers entered is: " + totalSum);

        System.err.println("""
                I'm teaching my people git/github.
                So far, I've taught them how to:
                1. Create a repository on github
                2. Clone the repository to their local machine
                3. Create a new branch
                4. Make changes to the code
                5. Add the changes or stage the changes for commit
                6. Commit the changes
                7. Push the changes to github
                """);
    }
}
