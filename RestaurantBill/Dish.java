package RestaurantBill;

public class Dish {
    private String dish;
    private Integer cost;
    private Integer quantity;

    public Dish(String dish, Integer cost) {
        this.dish = dish;
        this.cost = cost;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getDish() {
        return dish;
    }

    public Integer getCost() {
        return cost;
    }
}
