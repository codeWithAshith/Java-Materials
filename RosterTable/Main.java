package RosterTable;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> roster = new ArrayList<>();

        ArrayList<String> dayOne = new ArrayList<>();
        ArrayList<String> dayTwo = new ArrayList<>();
        ArrayList<String> dayThree = new ArrayList<>();

        dayOne.add("Alice");
        dayOne.add("Bob");
        roster.add(dayOne);

        dayTwo.add("Alice");
        dayTwo.add("Sam");
        dayTwo.add("Mike");
        roster.add(dayTwo);

        dayThree.add("Bob");
        dayThree.add("Sam");
        roster.add(dayThree);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the person to view the roaster.");
        System.out.println("Alice, Mike, Sam, Bob");
        String name = scanner.next();

        getDays(roster, name);

        scanner.close();
    }

    private static void getDays(ArrayList<ArrayList<String>> roster, String name) {
        for (ArrayList<String> days : roster) {
            for (String day : days) {
                if (day.contentEquals(name)) {
                    int d = roster.indexOf(days) + 1;
                    System.out.println("Day " + d);
                }
            }
        }
    }
}
