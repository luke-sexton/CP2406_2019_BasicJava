package week7;

public class candle {
    private String colour;
    private int height; // in inches
    private float price;

    public void setColor(String colour) {
        this.colour = colour;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return colour;
    }

    public float getHeight() {
        return this.height;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice() {
        this.price = height * 2;
    }

    public candle(String colour, int height) {
        setColor(colour);
        setHeight(height);
        setPrice();
    }

}
