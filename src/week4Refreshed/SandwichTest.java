package week4Refreshed;

import org.junit.jupiter.api.Test;

class SandwichTest {
    @Test
    void testDefault() {
        Sandwich sandwich = new Sandwich("Tuna", "White", 4.99);
        String mainIngredient = sandwich.getMainIngredient();
        String breadType = sandwich.getBreadType();
        double price = sandwich.getPrice();

        System.out.println(mainIngredient);
        System.out.println(breadType);
        System.out.println(price);
    }

}