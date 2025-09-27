package chapterTwo.assignments;

import java.util.Scanner;

public class ArithmeticTest {
    /**
     * Todo 2.15 (Arithmetic) Write an application that asks the user to enter two integers, obtains them from
     * Todo - the user and prints the square of each, the sum of their squares, and the difference of the squares (first
     * Todo - number squared minus the second number squared). Also, specify the smallest between the two integers.
     * **/

    public static void main(String[] args) {

        System.out.println("          *");
        System.out.print("         *  *");
        System.out.print("        *     *");
        System.out.print("       *       *");
        System.out.print("      ***********");



        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        int squareOfFirstNumber = firstNumber * firstNumber;
        System.out.printf("The square of %s = %s%n", firstNumber, squareOfFirstNumber);

        int squareOfSecondNumber = secondNumber * secondNumber;
        System.out.printf("The square of %s = %s%n", secondNumber, squareOfSecondNumber);

        int sumOfSquares = squareOfFirstNumber + squareOfSecondNumber;
        System.out.printf("The sum of the squares = %s%n", sumOfSquares);

        int differenceOfSquares = squareOfFirstNumber - squareOfSecondNumber;
        System.out.printf("The difference of the squares = %s%n", differenceOfSquares);

        System.out.print("Buy Rice");
        if ("beans".equalsIgnoreCase("available")) {
            System.out.printf("Buy Egg");
        }
        if ("beans".equalsIgnoreCase("is not available")) {
            System.out.printf("Buy Meat");
        }
    }
}
