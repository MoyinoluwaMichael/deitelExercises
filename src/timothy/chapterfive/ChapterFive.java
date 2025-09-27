package timothy.chapterfive;

import java.util.Scanner;

public class ChapterFive {
    public static void main(String[] args) {
        int userInput = new Scanner(System.in).nextInt();


        switch (userInput) {
            case 1:
                System.out.println("You entered one.");
//                break;
            case 2:
                System.out.println("You entered two.");
//                break;
            case 3:
                System.out.println("You entered three.");
//                break;
            default:
                System.out.println("You entered a number greater than three or less than one.");
        }
    }
}
