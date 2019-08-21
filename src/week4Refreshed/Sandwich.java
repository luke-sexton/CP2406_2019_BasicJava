package week4Refreshed;

public class Sandwich {
    private String mainIngredient;
    private String breadType;
    private double price;

    public Sandwich(String value) {
        setMainIngredient(value);
    }

    // Getter Methods
    public String getMainIngredient() {
        return mainIngredient;
    }

    // Setter Methods
    public void setMainIngredient(String value) {
        mainIngredient = value;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String value) {
        breadType = value;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double value) {
        price = value;
    }
}
