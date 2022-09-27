package BudgetAllocation;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How much can you spend : ");
        double total = scanner.nextDouble();
        double sum = 0;
        int i = 0;
        ArrayList<Double> proportion = new ArrayList<>();

        System.out.println("Enter your proportion on various expenses.");
        System.out.println("The system stops if your cumulative proportion exceeds 100%");
        System.out.println("-----------------");

        do {
            System.out.print("Your proportion of expense " +
                    (i + 1) + ": ");
            double value = scanner.nextDouble();
            sum = sum + value;
            proportion.add(value);
            i++;
        } while (sum <= 100);
        if (sum > 100) {
            double cumulativeSum = 0.0;
            for (int j = 0; j < proportion.size() - 1; j++) {
                cumulativeSum += proportion.get(j);
            }
            proportion.set(proportion.size() - 1, 100.0 - cumulativeSum);
        }
        System.out.println("-----------------");
        for (double value : proportion) {
            double expense = value * total / 100.0;
            System.out.println("Your " + value + "% equals to ₹" + expense);
        }
    }
}
