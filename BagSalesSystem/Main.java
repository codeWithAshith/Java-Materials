package BagSalesSystem;

public class Main {
    public static void main(String[] args) {
        PaperBag paperBag = new PaperBag();
        paperBag.setLength(10.0);
        paperBag.setWidth(10.0);
        System.out.println("The price of paper bag with width " + paperBag.getWidth()
                + " and length " + paperBag.getLength() + " is ₹" + paperBag.getPrice());

        PlasticBag plasticBag = new PlasticBag();
        plasticBag.setWidth(10.0);
        plasticBag.setLength(10.0);
        plasticBag.setTax(0.2);
        System.out.println("The price of plastic bag with width " + plasticBag.getWidth()
                + " and length " + plasticBag.getLength() + " is ₹" + plasticBag.getPrice());

    }
}
