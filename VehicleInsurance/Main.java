package VehicleInsurance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the vehicle type: car, truck, bus, motorcycle");
        String type = scanner.next();
        int premium = 0;

        switch (type) {
            case "car" -> premium = 200;
            case "truck" -> premium = 300;
            case "bus" -> premium = 400;
            case "motorcycle" -> {
                System.out.println("Enter the motorcycle type: high, low, medium");
                String motorCycleType = scanner.next();
                switch (motorCycleType) {
                    case "high" -> premium = 200;
                    case "medium" -> premium = 150;
                    case "low" -> premium = 100;
                    default -> System.out.println("Invalid choice");
                }
            }
            default -> System.out.println("Invalid choice");
        }
        scanner.close();
        System.out.println("Your premium is ₹" + premium);
    }
}
