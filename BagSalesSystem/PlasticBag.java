package BagSalesSystem;

public class PlasticBag extends Bag {
    private double tax;

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public double getPrice() {
        double area = getLength() * getWidth();
        if (area > 300.0) {
            price = 0.2;
        } else {
            price = 0.15;
        }
        return price + tax;
    }
}
