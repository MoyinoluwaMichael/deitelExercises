package arrayclass;

public class Loop {

    public static void main(String[] args) {
        int noOfStudents = 5;
        int noOfCourses = 3;

        for (int i = 0; i < noOfStudents; i++) {
            int sum = 0;
            for (int j = 0; j < noOfCourses; j++) {
                sum += i+j;
            }
            System.out.println("Student " + (i+1) + "'s total score = " + sum);
        }
    }
}
