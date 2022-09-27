package AverageStockPrice;

public class Stock {
    private int shares;
    private double price;
    private double capital;

    public void buy(double price, int shares) {
        this.price = price;
        this.shares += shares;
        this.capital += shares * price;
    }

    public void sell(double price, int shares) {
        this.price = price;
        this.shares -= shares;
        this.capital -= shares * price;
    }

    public int getShares() {
        return shares;
    }

    public double getPrice() {
        return price;
    }

    public double getAveragePrice() {
        return capital / shares;
    }
}
