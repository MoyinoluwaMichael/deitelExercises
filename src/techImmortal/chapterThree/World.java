package techImmortal.chapterThree;

import java.util.Scanner;

public class World {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        Human human = new Human();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        human.setName(name);

        Human human2 = new Human();
        System.out.println("Human name: "+human.getName());

        System.out.println("Human age: "+human.getAge());
    }
}
