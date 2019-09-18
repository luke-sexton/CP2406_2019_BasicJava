package week8;

public class InternationalDivision extends Division {
    String country;
    String language;
    public InternationalDivision(String name, int accountNumber, String country, String language) {
        super(name, accountNumber);
        this.country = country;
        this.language = language;
    }

    @Override
    void display() {
        System.out.println("\nName: " + name + "\nAccount Number: " + accountNumber + "\nCountry: " + country +
                "\nLanguage: " + language);
    }
}
