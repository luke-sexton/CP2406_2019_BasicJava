package week7;

public class ScentedCandle extends Candle {
    private String scent;

    public ScentedCandle(String colour, int height) {
        super(colour, height);
    }

    public String getScent() {
        return scent;
    }

    public void setScent(String scent) {
        this.scent = scent;
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        this.priceCalculation = 3;
        this.price = height * this.priceCalculation;
    }
}
