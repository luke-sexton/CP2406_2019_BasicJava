package week7;

public class DemoCandles {
    public static void main(String[] args) {
        Candle candle = new Candle("White",6);
        ScentedCandle scentedCandle = new ScentedCandle("Red", 6);
        scentedCandle.setScent("Strawberry");

        System.out.println("Normal Candle: " + candle.getColor() + " and " + candle.getHeight() + " inches for $" +
                candle.getPrice() + ".");
        System.out.println("Scented Candle: " + scentedCandle.getColor() + " and " + scentedCandle.getHeight() +
                " inches with a scent of " + scentedCandle.getScent() + " for $" +
                scentedCandle.getPrice() + ".");
    }
}
