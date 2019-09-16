package week7;

public class Candle {
    String colour;
    int height; // in inches
    float price;
    int priceCalculation = 2;

    public Candle(String colour, int height) {
        setColor(colour);
        setHeight(height);
    }

    public void setColor(String colour) {
        this.colour = colour;
    }

    public void setHeight(int height) {
        this.height = height;
        this.price = height * this.priceCalculation;
    }

    public String getColor() {
        return colour;
    }

    public int getHeight() {
        return this.height;
    }

    public float getPrice() {
        return this.price;
    }
}
