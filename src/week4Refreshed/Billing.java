package week4Refreshed;

public class Billing {
    private double taxPercentage = 0.08;

    public double computeBill(double price) {
        return price + (price * this.taxPercentage);
    }

    public double computeBill(double price, int booksOrdered) {
        double totalPrice = price * booksOrdered;
        return totalPrice + (totalPrice * this.taxPercentage);
    }

    public double computeBill(double price, int booksOrdered, double couponValue) {
        double totalPrice = price * booksOrdered;
        double discountedPrice = totalPrice - couponValue;

        return discountedPrice + (discountedPrice * this.taxPercentage);
    }
}
