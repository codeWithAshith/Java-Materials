package RestaurantBill;

import java.util.ArrayList;

public class Bill {
    private ArrayList<Dish> orderedDish;
    private double totalCost;

    public Bill() {
        totalCost = 0.0;
        orderedDish = new ArrayList<>();
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void addOrder(String meal, int quantity, ArrayList<Dish> dishes) {
        for (Dish value : dishes) {
            if (meal.equals(value.getDish())) {
                totalCost += quantity * value.getCost();
                Dish dish = new Dish(meal, value.getCost());
                dish.setQuantity(quantity);
                orderedDish.add(dish);
            }
        }
    }

    public void getOrder() {
        for (Dish dish : orderedDish) {
            System.out.println(dish.getDish() + " - " + dish.getQuantity());
        }
    }
}
