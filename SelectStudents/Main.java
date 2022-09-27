package SelectStudents;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numOfStudents = scanner.nextInt();

        String[] students = new String[numOfStudents];
        int[] ages = new int[numOfStudents];

        for (int i = 0; i < numOfStudents; i++) {
            System.out.print("Enter the student name: ");
            students[i] = scanner.next();
            System.out.print("Enter the student's age: ");
            ages[i] = scanner.nextInt();
        }

        for (int i = 0; i < numOfStudents; i++) {
            if (ages[i] >= 15) {
                System.out.println(students[i] + "can receive a vaccine");
                System.out.println("The student is now " + ages[i]);
            }
        }
    }
}
