package BagSalesSystem;

public abstract class Bag {
    private double length;
    private double width;
    // subclass can access "price" directly
    protected double price;

    public abstract double getPrice();

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


}
