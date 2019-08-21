package week4Refreshed;

public class Sandwich {
    private String mainIngredient;
    private String breadType;
    private double price;

    public Sandwich(String mainIngredient, String breadType, double price) {
        setMainIngredient(mainIngredient);
        setBreadType(breadType);
        setPrice(price);
    }

    // Setter Methods
    public void setMainIngredient(String value) {
        this.mainIngredient = value;
    }
    public void setPrice(double value) {
        this.price = value;
    }
    public void setBreadType(String value) {
        this.breadType = value;
    }


    // Getter Methods
    public String getMainIngredient() {
        return this.mainIngredient;
    }
    public double getPrice() {
        return this.price;
    }
    public String getBreadType() {
        return this.breadType;
    }
}
