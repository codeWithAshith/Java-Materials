package RestaurantBill;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Dish> dishes = new ArrayList<>();
        dishes.add(new Dish("Sandwich", 90));
        dishes.add(new Dish("Coffee", 60));
        dishes.add(new Dish("French Fries", 100));
        dishes.add(new Dish("Salad", 50));

        Bill bill = new Bill();
        bill.addOrder("Sandwich", 2, dishes);
        bill.addOrder("Salad", 1, dishes);
        bill.addOrder("Coffee", 2, dishes);

        System.out.println("Your Bill:");
        System.out.println("----------");
        bill.getOrder();
        System.out.println("Total - ₹" + bill.getTotalCost());
    }
}
