package InvestmentEarning;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day = 1;
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your buying price per share: ");
        double buyPrice = scanner.nextDouble();

        while (true) {
            System.out.print("Enter the closing price for day " + day +
                    " (any negative value to leave:): ");
            double closingPrice = scanner.nextDouble();

            if (closingPrice < 0) break;

            double earnings = closingPrice - buyPrice;

            if (earnings > 0) {
                System.out.println("After day " + day + ", you earned " + df.format(earnings)
                        + " per share.");
            } else if (earnings < 0) {
                System.out.println("After day " + day + ", you lost " + df.format(-earnings)
                        + " per share.");
            } else {
                System.out.println("After day " + day + ", you have " + "no earning per share.");
            }
            day += 1;
        }
        scanner.close();
    }
}
