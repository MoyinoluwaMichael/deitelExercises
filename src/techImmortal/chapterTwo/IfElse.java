package techImmortal.chapterTwo;

import java.util.Scanner;

public class IfElse {
    /*
    Write an application that reads five integers and determines and
    prints the largest and smallest integers in the group.
    Use only the programming techniques you learned in this chapter.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int firstInteger = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int secondInteger = scanner.nextInt();

        System.out.print("Enter third integer: ");
        int thirdInteger = scanner.nextInt();

        int largestNumber = thirdInteger;

        if (largestNumber < firstInteger) { // firstInteger = -10
            largestNumber = firstInteger; // largestNumber = -10
        }
        if (largestNumber < secondInteger) { // secondInteger = -14,
            largestNumber = secondInteger; //largestNumber = -10
        }
        if (largestNumber < thirdInteger) { // thirdInteger = -8
            largestNumber = thirdInteger; // largestNumber = -8
        }

        System.out.println("The largest number is: " + largestNumber);

    }
}
