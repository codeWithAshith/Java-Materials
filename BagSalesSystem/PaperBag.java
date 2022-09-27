package BagSalesSystem;

public class PaperBag extends Bag{

    @Override
    public double getPrice() {
        double area = getLength() * getWidth();
        if (area > 300.0) {
            price = 0.2;
        } else {
            price = 0.15;
        }
        return price;
    }
}
