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
    }
}
