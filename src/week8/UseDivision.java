package week8;

public class UseDivision {
    public static void main(String[] args) {
        InternationalDivision internationalDivision = new InternationalDivision("International", 111, "Korea", "Korean");
        DomesticDivision domesticDivision = new DomesticDivision("Domestic", 201, "QLD");

        internationalDivision.display();
        domesticDivision.display();
    }
}
