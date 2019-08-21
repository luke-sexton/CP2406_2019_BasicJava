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
        mainIngredient = value;
    }
    public void setPrice(double value) {
        price = value;
    }
    public void setBreadType(String value) {
        breadType = value;
    }


    // Getter Methods
    public String getMainIngredient() {
        return mainIngredient;
    }
    public double getPrice() {
        return price;
    }
    public String getBreadType() {
        return breadType;
    }
}
