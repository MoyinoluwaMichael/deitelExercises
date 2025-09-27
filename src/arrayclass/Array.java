package arrayclass;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int noOfStudents = scanner.nextInt();
        System.out.println();
        System.out.print("Enter the number of courses: ");
        int noOfCourses = scanner.nextInt();
        System.out.println();


        int[][] reportCard = new int[noOfStudents][noOfCourses+1];

        for (int studentIndex = 0; studentIndex < reportCard.length; studentIndex++) {
            int sum = 0;
            for (int courseIndex = 0; courseIndex < noOfCourses; courseIndex++) {
                System.out.print("Student " + (studentIndex + 1) + " Course " + (courseIndex + 1) + " score: ");
                int score = scanner.nextInt();
                reportCard[studentIndex][courseIndex] = score;
                sum += score;
            }
            int lastIndex = reportCard[studentIndex].length - 1;
            reportCard[studentIndex][lastIndex] = sum;
        }

        System.out.printf("%12s", " ");
        for (int courseIndex = 0; courseIndex < noOfCourses; courseIndex++) {
            String value = "Course " + (courseIndex + 1);
            System.out.printf("%-12s", value);
        }
        System.out.println("Total");

        for (int studentIndex = 0; studentIndex < reportCard.length; studentIndex++) {
            String value = "Student "+(studentIndex + 1);
            System.out.printf("%-14s", value);
            for (int courseIndex = 0; courseIndex < reportCard[studentIndex].length; courseIndex++) {
                System.out.printf("%-12s", reportCard[studentIndex][courseIndex]);
            }
            System.out.println();
        }


    }
}
